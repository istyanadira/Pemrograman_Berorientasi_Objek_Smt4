public class NullPointer2 {
    public static void main(String[] args) {

        try {
            String nama = null;

            System.out.println(nama.length());

        } catch (NullPointerException e) {
            System.out.println("Objek masih null ");
        }

        System.out.println("Program selesai");
    }
}