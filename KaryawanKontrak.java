package Tugas_18052026_Karyawan;

public class KaryawanKontrak extends Karyawan {

    private int jamKerja;
    private double gajiPerJam;

    public KaryawanKontrak(int jamKerja, double gajiPerJam, String nama, double totalGaji) {
        super(nama, totalGaji);
        this.jamKerja = jamKerja;
        this.gajiPerJam = gajiPerJam;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public double getGajiPerJam() {
        return gajiPerJam;
    }

    public void setGajiPerJam(double gajiPerJam) {
        this.gajiPerJam = gajiPerJam;
    }
    
    @Override
    public void hitungGaji() {
        totalGaji = jamKerja * gajiPerJam;

        System.out.println("=== Karyawan Kontrak ===");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Jam Kerja : " + jamKerja);
        System.out.println("Gaji Per Jam : " + gajiPerJam);
        System.out.println("Total Gaji : " + totalGaji);
    }
    
}
