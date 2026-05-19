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
public class Motor extends Transportasi {
    private String namaDriver;

    public Motor(String namaDriver, String namaPenumpang, String tujuan, double biaya) {
        super(namaPenumpang, tujuan, biaya);
        this.namaDriver = namaDriver;
    }

    public String getNamaDriver() {
        return namaDriver;
    }

    public void setNamaDriver(String namaDriver) {
        this.namaDriver = namaDriver;
    }
    
    @Override
    public void tampilInfo() {
        System.out.println("=== TRANSPORTASI MOTOR ===");
        System.out.println("Nama Penumpang : " + namaPenumpang);
        System.out.println("Tujuan         : " + tujuan);
        System.out.println("Nama Driver    : " + namaDriver);
        System.out.println("Biaya          : Rp" + biaya);
    }
}
