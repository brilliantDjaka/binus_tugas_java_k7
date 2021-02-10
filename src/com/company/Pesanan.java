package com.company;

public class Pesanan {
    String[] namaPesanan;
    int[] jumlah;
    int[] harga;
    int jumlahPembelian;
    Pesanan(int jumlahPembelian){
        namaPesanan = new String[jumlahPembelian];
        jumlah = new int[jumlahPembelian];
        harga = new  int[jumlahPembelian];
        this.jumlahPembelian = jumlahPembelian;
    }

    void tambahPesanan(int nomer, String nama, int jumlah, int harga){
        this.namaPesanan[nomer] = nama;
        this.jumlah[nomer] = jumlah;
        this.harga[nomer] = harga;
    }
    int printDanHitungTotal(){
        int total = 0;
        System.out.println(" ===========================================================");
        System.out.println(" ||   Nama Barang    || Jumlah ||   Harga   ||   Total    ||");
        System.out.println(" ===========================================================");

        for (int i = 0; i < jumlahPembelian; i++) {
            total += jumlah[i] * harga[i];
            System.out.println(String.format(" || %-16s ||  %3d   || Rp %6d || Rp %7d ||",namaPesanan[i],jumlah[i],harga[i],jumlah[i] * harga[i]));
        }
        return  total;
    }

}