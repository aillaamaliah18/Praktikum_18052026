package Tugas_18052026_Karyawan;

public abstract class Karyawan {
    protected String nama;
    protected double totalGaji;

    public Karyawan(String nama, double totalGaji) {
        this.nama = nama;
        this.totalGaji = totalGaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(double totalGaji) {
        this.totalGaji = totalGaji;
    }

    public abstract void hitungGaji();
}
