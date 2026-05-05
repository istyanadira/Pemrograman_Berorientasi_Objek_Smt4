import java.util.ArrayDeque;

public class ContohArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> antrian = new ArrayDeque<>();

        antrian.add("NO 001");
        antrian.add("NO 002");
        antrian.add("NO 003");

        System.out.println("Isi Antrian:" + antrian);

        System.out.println("Diambil  " + antrian.poll());

        System.out.println("Sisa Antrian:" + antrian);
    }
}