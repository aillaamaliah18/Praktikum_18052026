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
public abstract class Transportasi {
    protected String namaPenumpang;
    protected String tujuan;
    protected double biaya;

    public Transportasi(String namaPenumpang, String tujuan, double biaya) {
        this.namaPenumpang = namaPenumpang;
        this.tujuan = tujuan;
        this.biaya = biaya;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public double getBiaya() {
        return biaya;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }

    public abstract void tampilInfo();
}
