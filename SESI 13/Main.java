import java.sql.*;
import java.util.Scanner;

public class Main {
    // Sila sesuaikan URL, USER, dan PASSWORD mengikut tetapan MySQL/XAMPP anda
    private static final String URL = "jdbc:mysql://localhost:3306/toko_retail";
    private static final String USER = "root";
    private static final String PASSWORD = ""; 

    private static Connection conn;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            // Membuka sambungan ke database toko_retail
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            
            int pilihan;
            do {
                tampilMenu();
                System.out.print("Pilihan : ");
                if (scanner.hasNextInt()) {
                    pilihan = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan buffer

                    switch (pilihan) {
                        case 1:
                            tampilSemuaData();
                            break;
                        case 2:
                            tambahData();
                            break;
                        case 3:
                            cariData();
                            break;
                        case 4:
                            ubahData();
                            break;
                        case 5:
                            hapusData();
                            break;
                        case 0:
                            System.out.println("Terima kasih! Keluar dari program.");
                            break;
                        default:
                            System.out.println("Pilihan tidak sah! Sila pilih menu 0-5.");
                    }
                } else {
                    System.out.println("Sila masukkan angka!");
                    scanner.nextLine(); // Membersihkan input yang salah
                    pilihan = -1;
                }
            } while (pilihan != 0);

            conn.close();
        } catch (SQLException e) {
            System.out.println("Sambungan database gagal: " + e.getMessage());
        }
    }

    // Paparan Menu Utama Aplikasi CLI
    private static void tampilMenu() {
        System.out.println("\n+---------------------------------+");
        System.out.println("|        MENU TOKO RETAIL         |");
        System.out.println("+---------------------------------+");
        System.out.println("| 1. Tampil Semua Data            |");
        System.out.println("| 2. Tambah Data                  |");
        System.out.println("| 3. Cari Data                    |");
        System.out.println("| 4. Ubah Data                    |");
        System.out.println("| 5. Hapus Data                   |");
        System.out.println("| 0. Keluar                       |");
        System.out.println("+---------------------------------+");
    }

    // 1. MENU: TAMPIL SEMUA DATA
    private static void tampilSemuaData() {
        String query = "SELECT kode_barang, nama_barang, harga_barang, stok_barang FROM tbl_barang";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            
            System.out.println("\n+-----------------------------------------------------------+");
            System.out.println("|                 DAFTAR BARANG TOKO RETAIL                 |");
            System.out.println("+-----+--------+----------------------+----------+----------+");
            System.out.println("| #   | Kode   | Nama Barang          | Harga    | Stok     |");
            System.out.println("+-----+--------+----------------------+----------+----------+");
            
            int no = 1;
            while (rs.next()) {
                System.out.printf("| %-3d | %-6s | %-20s | %-8d | %-8d |\n",
                        no++,
                        rs.getString("kode_barang"),
                        rs.getString("nama_barang"),
                        rs.getInt("harga_barang"),
                        rs.getInt("stok_barang"));
            }
            System.out.println("+-----+--------+----------------------+----------+----------+");
            System.out.println("Total: " + (no - 1) + " barang");
            
        } catch (SQLException e) {
            System.out.println("Gagal mengambil data: " + e.getMessage());
        }
    }

    // 2. MENU: TAMBAH DATA
    private static void tambahData() {
        System.out.println("\n--- TAMBAH DATA BARANG ---");
        System.out.print("Masukkan Kode Barang: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan Nama Barang: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Harga Barang: ");
        int harga = scanner.nextInt();
        System.out.print("Masukkan Stok Barang: ");
        int stok = scanner.nextInt();

        String query = "INSERT INTO tbl_barang (kode_barang, nama_barang, harga_barang, stok_barang) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, kode);
            pstmt.setString(2, nama);
            pstmt.setInt(3, harga);
            pstmt.setInt(4, stok);
            pstmt.executeUpdate();
            System.out.println("Data berjaya ditambahkan!");
        } catch (SQLException e) {
            System.out.println("Gagal menambah data (Kemungkinan kod barang sudah wujud): " + e.getMessage());
        }
    }

    // 3. MENU: CARI DATA
    private static void cariData() {
        System.out.println("\n--- CARI DATA BARANG ---");
        System.out.print("Masukkan Nama atau Kode Barang: ");
        String keyword = scanner.nextLine();

        String query = "SELECT kode_barang, nama_barang, harga_barang, stok_barang FROM tbl_barang " +
                       "WHERE nama_barang LIKE ? OR kode_barang LIKE ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, "%" + keyword + "%");
            pstmt.setString(2, "%" + keyword + "%");
            ResultSet rs = pstmt.executeQuery();

            int no = 1;
            while (rs.next()) {
                System.out.printf("%d. [%s] %s - Harga: %d, Stok: %d\n",
                        no++, 
                        rs.getString("kode_barang"), 
                        rs.getString("nama_barang"), 
                        rs.getInt("harga_barang"), 
                        rs.getInt("stok_barang"));
            }
            if (no == 1) {
                System.out.println("Barang tidak ditemui.");
            }
        } catch (SQLException e) {
            System.out.println("Gagal mencari data: " + e.getMessage());
        }
    }

    // 4. MENU: UBAH DATA
    private static void ubahData() {
        System.out.println("\n--- UBAH DATA BARANG ---");
        System.out.print("Masukkan Kode Barang yang ingin diubah: ");
        String kode = scanner.nextLine();

        // Menyemak jika data barang wujud sebelum diubah
        String cekQuery = "SELECT * FROM tbl_barang WHERE kode_barang = ?";
        try (PreparedStatement pstmtCek = conn.prepareStatement(cekQuery)) {
            pstmtCek.setString(1, kode);
            ResultSet rs = pstmtCek.executeQuery();

            if (rs.next()) {
                System.out.print("Nama Baru: ");
                String namaBaru = scanner.nextLine();
                System.out.print("Harga Baru: ");
                int hargaBaru = scanner.nextInt();
                System.out.print("Stok Baru: ");
                int stokBaru = scanner.nextInt();

                String updateQuery = "UPDATE tbl_barang SET nama_barang=?, harga_barang=?, stok_barang=? WHERE kode_barang=?";
                try (PreparedStatement pstmtUpdate = conn.prepareStatement(updateQuery)) {
                    pstmtUpdate.setString(1, namaBaru);
                    pstmtUpdate.setInt(2, hargaBaru);
                    pstmtUpdate.setInt(3, stokBaru);
                    pstmtUpdate.setString(4, kode);
                    pstmtUpdate.executeUpdate();
                    System.out.println("Data berjaya dikemaskini!");
                }
            } else {
                System.out.println("Kode barang tidak ditemui.");
            }
        } catch (SQLException e) {
            System.out.println("Gagal mengubah data: " + e.getMessage());
        }
    }

    // 5. MENU: HAPUS DATA
    private static void hapusData() {
        System.out.println("\n--- HAPUS DATA BARANG ---");
        System.out.print("Masukkan Kode Barang yang ingin dihapus: ");
        String kode = scanner.nextLine();

        String query = "DELETE FROM tbl_barang WHERE kode_barang = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, kode);
            int rowsDeleted = pstmt.executeUpdate();
            
            if (rowsDeleted > 0) {
                System.out.println("Data berjaya dihapus!");
            } else {
                System.out.println("Kode barang tidak ditemui.");
            }
        } catch (SQLException e) {
            System.out.println("Gagal menghapus data: " + e.getMessage());
        }
    }
}