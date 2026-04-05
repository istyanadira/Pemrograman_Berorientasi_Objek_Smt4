class BankBNI extends Bank {

    @Override
    void sukuBunga() {
        System.out.println("Suku Bunga BNI adalah 4%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BNI";
        int biaya = hitungBiaya(bankTujuan);

        System.out.println("Transfer " + jumlah + " ke " + rekeningTujuan + " di bank " + bankTujuan + " dengan biaya " + biaya);
    }
}