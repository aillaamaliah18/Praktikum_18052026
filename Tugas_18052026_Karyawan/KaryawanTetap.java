package Tugas_18052026_Karyawan;

public class KaryawanTetap extends Karyawan {

    private double gajiPerBulan;
    private double tunjangan;

    public KaryawanTetap(double gajiPerBulan, double tunjangan, String nama, double totalGaji) {
        super(nama, totalGaji);
        this.gajiPerBulan = gajiPerBulan;
        this.tunjangan = tunjangan;
    }

    public double getGajiPerBulan() {
        return gajiPerBulan;
    }

    public void setGajiPerBulan(double gajiPerBulan) {
        this.gajiPerBulan = gajiPerBulan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    @Override
    public void hitungGaji() {
        tunjangan = 0.025 * gajiPerBulan;
        totalGaji = gajiPerBulan + tunjangan;

        System.out.println("=== Karyawan Tetap ===");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Gaji Pokok : " + gajiPerBulan);
        System.out.println("Tunjangan : " + tunjangan);
        System.out.println("Total Gaji : " + totalGaji);
    }
    
}
