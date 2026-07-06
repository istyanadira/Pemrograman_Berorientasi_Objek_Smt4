import java.io.*;

public class BuatFile {
    public static void main(String[] args) {
        try {
            File f = new File("file.txt");
            if (f.createNewFile()) {
                System.out.println("File berhasil dibuat: " + f.getName());
            } else {
                System.out.println("File sudah ada: ");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membuat file");
            // e.printStackTrace();
        }
    }
}