import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) {

        String csvFile = "students.csv";
        String line;
        String csvSplitBy = ",";
        int jumlahBaris = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] student = line.split(csvSplitBy);

                for (String data : student) {
                    System.out.print(data + "\t");
                }

                System.out.println();
                jumlahBaris++;
            }

            System.out.println("\nJumlah baris pada file CSV: " + jumlahBaris);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}