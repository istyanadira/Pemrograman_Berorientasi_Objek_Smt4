import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Mahasiswa mhs = new Mahasiswa();
        System.out.print("Masukkan Nama Mahasiswa: ");
        mhs.setNama(input.nextLine());

        System.out.print("Masukkan NIM: ");
        mhs.setNim(input.nextLine());


        Dosen dosen = new Dosen();
        System.out.print("Masukkan Nama Dosen: ");
        dosen.setNama(input.nextLine());

        System.out.print("Masukkan NIP: ");
        dosen.setNip(input.nextLine());


        MataKuliah mk = new MataKuliah();
        System.out.print("Masukkan Nama Mata Kuliah: ");
        mk.setNamaMK(input.nextLine());

        mk.setDosen(dosen);


        System.out.println("\n=== DATA ===");
        System.out.println("Mahasiswa: " + mhs.getNama());
        System.out.println("NIM: " + mhs.getNim());
        System.out.println("Dosen: " + dosen.getNama());
        System.out.println("Mata Kuliah: " + mk.getNamaMK());
    }
}