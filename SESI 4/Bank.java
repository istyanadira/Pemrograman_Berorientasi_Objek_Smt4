class Bank {

    void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan);
    }

    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        int biaya = hitungBiaya(bankTujuan);
        System.out.println("Transfer " + jumlah + " ke " + rekeningTujuan + " di bank " + bankTujuan + " dengan biaya " + biaya);
    }

    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        int biaya = hitungBiaya(bankTujuan);
        System.out.println("Transfer " + jumlah + " ke " + rekeningTujuan + " di bank " + bankTujuan + " dengan berita: " + berita + " dan biaya " + biaya);
    }

    int hitungBiaya(String bankTujuan) {
        if (bankTujuan.equalsIgnoreCase("BNI")) {
            return 5000;
        } else if (bankTujuan.equalsIgnoreCase("BCA")) {
            return 6500;
        } else {
            return 4000;
        }
    }

    void sukuBunga() {
        System.out.println("Suku bunga standar adalah 3%");
    }
}