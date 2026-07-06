import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        String nim = input.nextLine();

        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Umur : ");
        String umur = input.nextLine();

        System.out.print("Masukkan Prodi : ");
        String prodi = input.nextLine();

        String csvFile = "students.csv";

        try (FileWriter writer = new FileWriter(csvFile, true)) {

            writer.append("\n");
            writer.append(nim).append(",");
            writer.append(nama).append(",");
            writer.append(umur).append(",");
            writer.append(prodi);

            System.out.println("Data berhasil ditambahkan!");

        } catch (IOException e) {
            e.printStackTrace();
        }

        input.close();
    }
}