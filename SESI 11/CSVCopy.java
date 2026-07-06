import java.io.*;

public class CSVCopy {

    public static void main(String[] args) {

        String sumber = "students.csv";
        String tujuan = "students_copy.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(sumber));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tujuan));
        ) {

            String line;

            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("File berhasil disalin ke " + tujuan);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}