class Produk {
    protected String nama;
    protected int harga;

    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String tampilInfo() {
        return "[UMUM] " + nama + " | Harga: " + harga;
    }
}

class ProdukFisik extends Produk {
    private double beratKg;

    public ProdukFisik(String nama, int harga, double beratKg) {
        super(nama, harga);
        this.beratKg = beratKg;
    }

    @Override
    public String tampilInfo() {
        return "[FISIK] " + nama + " | Harga: " + harga + " | Berat: " + beratKg + " kg";
    }
}

class ProdukDigital extends Produk {
    private String masaAktif;

    public ProdukDigital(String nama, int harga, String masaAktif) {
        super(nama, harga);
        this.masaAktif = masaAktif;
    }

    @Override
    public String tampilInfo() {
        return "[DIGITAL] " + nama + " | Harga: " + harga + " | Masa Aktif: " + masaAktif;
    }
}

class Kasir {
    public int hitungBayar(int harga, int qty) {
        return harga * qty;
    }

public int hitungBayar(int harga, int qty, double diskonPersen) {
    int total = harga * qty;
    return (int) (total - (total * diskonPersen / 100));
    }
}

public class DemoPolimorfisme {
    public static void main(String[] args) {

        System.out.println("=== DEMO POLIMORFISME ===");
        System.out.println("Memanggil tampilInfo() dari masing-masing objek:\n");

        Produk p1 = new Produk("Kaos Polos", 85000);
        ProdukFisik p2 = new ProdukFisik("Sepatu Sneakers", 350000, 1.5);
        ProdukDigital p3 = new ProdukDigital("E-Book Java", 50000, "1 Tahun");

        System.out.println(p1.tampilInfo());
        System.out.println(p2.tampilInfo());
        System.out.println(p3.tampilInfo());

        System.out.println("\n=== DEMO OVERLOADING ===");
        System.out.println("Memanggil hitungBayar() dengan argumen berbeda:\n");

        Kasir kasir = new Kasir();

        int total1 = kasir.hitungBayar(50000, 2);
        int total2 = kasir.hitungBayar(50000, 2, 10);

        System.out.println("hitungBayar(50000, 2): " + total1);
        System.out.println("hitungBayar(50000, 2, 10): " + total2);
    }
}