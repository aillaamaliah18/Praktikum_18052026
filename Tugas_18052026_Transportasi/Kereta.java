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
public class Kereta extends Transportasi {

    private String kelasKereta;
    private String nomorKursi;

    public Kereta(String kelasKereta, String nomorKursi, String namaPenumpang, String tujuan, double biaya) {
        super(namaPenumpang, tujuan, biaya);
        this.kelasKereta= kelasKereta;
        this.nomorKursi = nomorKursi;
        
    }

    public String getKelasKereta() {
        return kelasKereta;
    }

    public void setKelasKereta(String kelasKereta) {
        this.kelasKereta = kelasKereta;
    }

    public String getNomorKursi() {
        return nomorKursi;
    }

    public void setNomorKursi(String nomorKursi) {
        this.nomorKursi = nomorKursi;
    }
    
    @Override
    public void tampilInfo() {

        System.out.println("=== TRANSPORTASI KERETA ===");
        System.out.println("Nama Penumpang : " + namaPenumpang);
        System.out.println("Tujuan         : " + tujuan);
        System.out.println("Kelas          : " + kelasKereta);
        System.out.println("Nomor Kursi    : " + nomorKursi);
        System.out.println("Biaya          : Rp" + biaya);
    }
    
}
