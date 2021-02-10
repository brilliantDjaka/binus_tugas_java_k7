package com.company;
import java.util.Scanner;

public class Main {
    static int jumlahPembelian;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //define scanner
        System.out.print("================================================\n" +
                "                Warung Online\n" +
                "================================================\n" +
                " Menu :\n" +
                " Es Teh       Rp.3000\n" +
                " Es Jeruk     Rp.4000\n" +
                " Ayam Bakar   Rp.15000\n" +
                " Nasi Goreng  Rp.9000\n" +
                "================================================\n"+
                "Masukkan Jumlah Pembelian : ");
        jumlahPembelian = scanner.nextInt();

        Pesanan pesanan = new Pesanan(jumlahPembelian);// define pesanan object

        for (int nomer = 0; nomer < jumlahPembelian; nomer++) {
            scanner.nextLine(); // clean scanner leftover

            System.out.printf("Nama Pesanan ke-%d : ", (nomer + 1));
            String namaMakanan = scanner.nextLine();
            System.out.print("Jumlah Pesanan : ");
            int jumlahPesanan = scanner.nextInt();
            System.out.print("Harga Pesanan : Rp.");
            int harga = scanner.nextInt();
            pesanan.tambahPesanan(nomer, namaMakanan, jumlahPesanan, harga);
        }

        System.out.print("Jarak Pengiriman (Ongkir Rp.2000/km) : ");
        int ongkir = hitungOngkir(scanner.nextInt());
        int total = pesanan.printDanHitungTotal();
        System.out.println(" ===========================================================");
        System.out.println(String.format("\n Total                                      = Rp %d",total));
        System.out.println(String.format(" Ongkir                                     = Rp %d",ongkir));
        System.out.println(String.format(" Total Pembayaran                           = Rp %d",total+ongkir));
        System.out.println(" ===========================================================");
        System.out.print(" Bayar = Rp. ");
        int bayar = scanner.nextInt();
        System.out.println(" Kembalian = Rp. "+(bayar -(total+ongkir)));

        System.out.println(" ===========================================================\n" +
                "                      ---Terimakasih ---\n" +
                "             Silahkan Menunggu Pesanan Anda Sampai\n" +
                " ===========================================================");
    }

    static int hitungOngkir(int jarak) {
        return jarak * 2000;
    }
}
