import java.io.*;

public class InformationFile {
    public static void main(String[] args) {
        File f = new File("file.txt");

        if(f.exists()) {
            System.out.println("Nama file: " + f.getName());
            System.out.println("Path file: " + f.getAbsolutePath());
            System.out.println("Bisa ditulis: " + f.canWrite());
            System.out.println("Bisa dibaca: " + f.canRead());
            System.out.println("Ukuran file (byte): " + f.length());
        } else {
            System.out.println("File tidak ditemukan");
        }
    }
}