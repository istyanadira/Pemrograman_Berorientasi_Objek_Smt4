class Tabungan {
    private double saldo;

    void tambah(double jumlah) {
        saldo += jumlah;
    }

    void ambil(double jumlah) {
        saldo -= jumlah;
    }

    void infoSaldo() {
        System.out.println("Saldo saat ini: " + saldo);
    }
}

public class Contoh {
    public static void main(String[] args) {
        Tabungan dira = new Tabungan();
        // dira.saldo = 100000;
        dira.tambah(50000);
        dira.ambil(20000);
        dira.infoSaldo();
    }
}