public class Aritmetic1 {

    public static void main(String[] args) {

        try {
            int hasil = 10 / 0;
        System.out.println(hasil);

        } catch (ArithmeticException e) {
            System.out.println("Tidak bisa dibagi nol" + e.getMessage());
        }

        System.out.println("Program selesai");
    }
}