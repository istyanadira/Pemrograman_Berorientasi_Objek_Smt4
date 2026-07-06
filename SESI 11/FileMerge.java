import java.io.*;

public class FileMerge {

    public static void main(String[] args) {

        String file1 = "file1.txt";
        String file2 = "file2.txt";
        String output = "merged.txt";

        try (
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(output));
        ) {

            String line;

            // Membaca file pertama
            while ((line = br1.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            // Membaca file kedua
            while ((line = br2.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("File berhasil digabung menjadi " + output);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}