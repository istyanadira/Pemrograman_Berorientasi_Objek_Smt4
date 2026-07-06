import java.io.*;

public class TulisFile {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("contoh.txt");
            f.write("Belajar Pemrograman Handling File");
            f.close();
            System.out.println("Proses berhasil.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}