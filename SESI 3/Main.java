import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = input.nextInt();
        input.nextLine();

        Nilai[] mhs = new Nilai[jumlah];

        int totalNilai = 0;

        int jumlahA = 0;
        int jumlahB = 0;
        int jumlahC = 0;
        int jumlahD = 0;

        int lulus = 0;
        int tidakLulus = 0;

        String namaLulus = "";
        String namaTidakLulus = "";

        String namaA = "";
        String namaB = "";
        String namaC = "";
        String namaD = "";

        for(int i = 0; i < jumlah; i++) {

            mhs[i] = new Nilai();

            System.out.println("\nData Mahasiswa ke-" + (i+1));

            System.out.print("NIM : ");
            mhs[i].nim = input.nextLine();

            System.out.print("Nama : ");
            mhs[i].nama = input.nextLine();

            System.out.print("Nilai : ");
            mhs[i].nilai = input.nextInt();
            input.nextLine();

            char grade = mhs[i].hitungGrade();

            totalNilai += mhs[i].nilai;

            if(grade == 'A'){
                jumlahA++;
                lulus++;
                namaA += mhs[i].nama + ", ";
                namaLulus += mhs[i].nama + ", ";
            }
            else if(grade == 'B'){
                jumlahB++;
                lulus++;
                namaB += mhs[i].nama + ", ";
                namaLulus += mhs[i].nama + ", ";
            }
            else if(grade == 'C'){
                jumlahC++;
                lulus++;
                namaC += mhs[i].nama + ", ";
                namaLulus += mhs[i].nama + ", ";
            }
            else if(grade == 'D'){
                jumlahD++;
                tidakLulus++;
                namaD += mhs[i].nama + ", ";
                namaTidakLulus += mhs[i].nama + ", ";
            }
            else{
                tidakLulus++;
                namaTidakLulus += mhs[i].nama + ", ";
            }
        }

        System.out.println("\n========================================");

        for(int i = 0; i < jumlah; i++) {

            System.out.println("NIM : " + mhs[i].nim);
            System.out.println("Nama : " + mhs[i].nama);
            System.out.println("Nilai : " + mhs[i].nilai);
            System.out.println("Grade : " + mhs[i].grade);
            System.out.println("========================================");
        }

        double rata = (double) totalNilai / jumlah;

        System.out.println("Jumlah Mahasiswa : " + jumlah);
        System.out.println("Jumlah Mahasiswa yg Lulus : " + lulus + " yaitu " + namaLulus);
        System.out.println("Jumlah Mahasiswa yg Tidak Lulus : " + tidakLulus + " yaitu " + namaTidakLulus);

        System.out.println("Jumlah Mahasiswa dengan Nilai A = " + jumlahA + " yaitu " + namaA);
        System.out.println("Jumlah Mahasiswa dengan Nilai B = " + jumlahB + " yaitu " + namaB);
        System.out.println("Jumlah Mahasiswa dengan Nilai C = " + jumlahC + " yaitu " + namaC);
        System.out.println("Jumlah Mahasiswa dengan Nilai D = " + jumlahD + " yaitu " + namaD);

        System.out.println("Rata-rata nilai mahasiswa adalah : " + rata);

    }
}