public class Main {
    public static void main(String[] args) {

        // Object Bank biasa
        Bank bank = new Bank();
        bank.transferUang(100000, "12345");
        bank.transferUang(200000, "67890", "Mandiri");
        bank.transferUang(300000, "98765", "BRI", "Bayar hutang");
        bank.sukuBunga();

        System.out.println();

        // Object BNI
        BankBNI bni = new BankBNI();
        bni.transferUang(500000, "123654", "SeaBank");
        bni.sukuBunga();

        System.out.println();

        // Object BCA
        BankBCA bca = new BankBCA();
        bca.transferUang(700000, "456123", "Bank Jasa Jakarta");
        bca.sukuBunga();
    }
}