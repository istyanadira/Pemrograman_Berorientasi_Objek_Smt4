package produk;

import laptop.LaptopAbstract;

public class Toshiba extends LaptopAbstract {
    @Override
    public void hidupkan() {
        System.out.println("Toshiba menyala.");
    }

    @Override
    public void matikan() {
        System.out.println("Toshiba mati.");
    }

    @Override
    public void tambahVolume() {
        if (volume < 100) {
            volume += 10;
            System.out.println("Volume Toshiba: " + volume);
        } else {
            System.out.println("Volume sudah maksimal.");
        }
    }

    @Override
    public void kurangiVolume() {
        if (volume > 0) {
            volume -= 10;
            System.out.println("Volume Toshiba: " + volume);
        } else {
            System.out.println("Volume sudah minimal.");
        }
    }
}