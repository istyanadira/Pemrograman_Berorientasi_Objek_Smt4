package produk;

import laptop.LaptopAbstract;

public class MacBook extends LaptopAbstract {
    @Override
    public void hidupkan() {
        System.out.println("MacBook menyala");
    }

    @Override
    public void matikan() {
        System.out.println("MacBook mati");
    }

    @Override
    public void tambahVolume() {
        if (volume < 100) {
            volume += 10;
            System.out.println("Volume MacBook: " + volume);
        } else {
            System.out.println("Volume sudah maksimal");
        }
    }

    @Override
    public void kurangiVolume() {
        if (volume > 0) {
            volume -= 10;
            System.out.println("Volume MacBook: " + volume);
        } else {
            System.out.println("Volume sudah minimal");
        }
    }
}