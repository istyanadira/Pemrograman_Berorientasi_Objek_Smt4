import java.util.ArrayList;

public class ContohArrayList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswa = new ArrayList<>();

        mahasiswa.add("Linnea");
        mahasiswa.add("Alice");
        mahasiswa.add("Varka");

        System.out.println("Daftar Mahasiswa:");
        for (String nama : mahasiswa) {
            System.out.println(nama);
        }

        System.out.println("\nData index ke-1:  " + mahasiswa.get(1));
    }
}