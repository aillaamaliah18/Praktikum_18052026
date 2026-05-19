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
public class Bis extends Transportasi {

    private String kelasBis;

    public Bis(String kelasBis, String namaPenumpang, String tujuan, double biaya) {
        super(namaPenumpang, tujuan, biaya);
        this.kelasBis = kelasBis;
    }

    public String getKelasBis() {
        return kelasBis;
    }

    public void setKelasBis(String kelasBis) {
        this.kelasBis = kelasBis;
    }
    
    @Override
    public void tampilInfo() {

        System.out.println("=== TRANSPORTASI BIS ===");
        System.out.println("Nama Penumpang : " + namaPenumpang);
        System.out.println("Tujuan         : " + tujuan);
        System.out.println("Kelas Bis      : " + kelasBis);
        System.out.println("Biaya          : Rp" + biaya);
    }
}
