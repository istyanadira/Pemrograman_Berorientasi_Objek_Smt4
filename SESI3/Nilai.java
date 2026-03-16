class Nilai extends Mahasiswa {

    int nilai;
    char grade;
    String status;

    void hitungGrade() {

        if (nilai >= 80 && nilai <= 100) {
            grade = 'A';
            status = "Lulus";
        } 
        else if (nilai >= 70) {
            grade = 'B';
            status = "Lulus";
        } 
        else if (nilai >= 60) {
            grade = 'C';
            status = "Lulus";
        } 
        else if (nilai >= 50) {
            grade = 'D';
            status = "Tidak Lulus";
        } 
        else if (nilai >= 0) {
            grade = 'E';
            status = "Tidak Lulus";
        } 
        else {
            System.out.println("Input nilai anda salah");
        }
    }
}