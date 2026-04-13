package main;

import java.util.Scanner;
import laptop.Laptop;
import produk.Toshiba;
import produk.MacBook;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Laptop laptop;

        System.out.println("Pilih Laptop:");
        System.out.println("1. Toshiba");
        System.out.println("2. MacBook");
        System.out.print("Pilihan: ");
        int pilih = input.nextInt();
        input.nextLine();

        if (pilih == 1) {
            laptop = new Toshiba();
        } else {
            laptop = new MacBook();
        }

        String perintah;

        do {
            System.out.print("Masukkan perintah (ON/OFF/UP/DOWN): ");
            perintah = input.nextLine();

            switch (perintah.toUpperCase()) {
                case "ON":
                    laptop.hidupkan();
                    break;
                case "OFF":
                    laptop.matikan();
                    break;
                case "UP":
                    laptop.tambahVolume();
                    break;
                case "DOWN":
                    laptop.kurangiVolume();
                    break;
                default:
                    System.out.println("Perintah tidak dikenal");
            }

        } while (!perintah.equalsIgnoreCase("OFF"));

        input.close();
    }
}