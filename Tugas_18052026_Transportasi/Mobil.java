/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_18052026_Transportasi;

/**
 *
 * @author ASUS VIVOBOOK
 */
public class Mobil extends Transportasi {

private int jumlahKursi;

    public Mobil(int jumlahKursi, String namaPenumpang, String tujuan) {

        super(namaPenumpang, tujuan, jumlahKursi * 50000);

        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    @Override
    public void tampilInfo() {

        System.out.println("=== TRANSPORTASI MOBIL ===");
        System.out.println("Nama Penumpang : " + namaPenumpang);
        System.out.println("Tujuan         : " + tujuan);
        System.out.println("Jumlah Kursi   : " + jumlahKursi);
        System.out.println("Biaya          : Rp" + biaya);
    }

}
