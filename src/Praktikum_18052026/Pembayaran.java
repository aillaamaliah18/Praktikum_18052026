package Praktikum_18052026;

public abstract class Pembayaran {
    protected double jumlahBayar;
    protected String idTransaksi;
    
    public Pembayaran(double jumlahBayar, String idTransaksi){
        this.jumlahBayar = jumlahBayar;
        this.idTransaksi = idTransaksi;   
    }

    public double getJumlahBayar() {
        return jumlahBayar;
    }

    public void setJumlahBayar(double jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }
    
    public abstract void prosesPembayaran();
    
    
}
