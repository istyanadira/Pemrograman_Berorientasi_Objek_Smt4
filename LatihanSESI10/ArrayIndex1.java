public class ArrayIndex1 {
    public static void main(String[] args) {

        try {
            int[] angka = {1,2,3};

            System.out.println(angka[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks array tidak tersedia " + e.getMessage());
        }

        System.out.println("Program selesai");
    }
}