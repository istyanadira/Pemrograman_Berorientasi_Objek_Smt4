import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Nilai mhs = new Nilai();

        System.out.print("Masukkan NIM  : ");
        mhs.nim = input.nextLine();

        System.out.print("Masukkan Nama : ");
        mhs.nama = input.nextLine();

        System.out.print("Masukkan Nilai: ");
        mhs.nilai = input.nextInt();

        if (mhs.nilai < 0 || mhs.nilai > 100) {
            System.out.println("Input nilai anda salah");
            return;
        }

        mhs.hitungGrade();

        System.out.println("\n=== DATA NILAI MAHASISWA ===");
        System.out.println("NIM   : " + mhs.nim);
        System.out.println("Nama  : " + mhs.nama);
        System.out.println("Nilai : " + mhs.nilai);
        System.out.println("Grade : " + mhs.grade);
        System.out.println("Status: " + mhs.status);
    }
}