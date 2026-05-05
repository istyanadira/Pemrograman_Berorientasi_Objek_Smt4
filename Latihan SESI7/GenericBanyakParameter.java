public class GenericBanyakParameter {
    
    static class PairData<K, V> {
        private K key;
        private V value;

        public PairData(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        PairData<String, Double> transaksi = new PairData<>("TRX-1001", 150000.0);
        PairData<String, Integer> pelanggan = new PairData<>("CUST-01", 320);

        System.out.println("Transaksi : " + transaksi.getKey() + " | Rp" + transaksi.getValue());
        System.out.println("Pelanggan : " + pelanggan.getKey() + " | Poin " + pelanggan.getValue());
        System.out.println();
    }
}