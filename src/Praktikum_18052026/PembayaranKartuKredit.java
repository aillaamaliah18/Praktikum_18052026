package Praktikum_18052026;

public class PembayaranKartuKredit extends Pembayaran{
    private String nomorKartu;

    public PembayaranKartuKredit(String nomorKartu,double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.nomorKartu = nomorKartu;
    }

    public String getNomorKartu() {
        return nomorKartu;
    }

    public void setNomorKartu(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }
    
    @Override
    public void prosesPembayaran(){
        System.out.println("Pembayaran melalui E-Wallet: ");
        System.out.println("Nomor Kartu Kredit: "+ nomorKartu);
        System.out.println("ID Transaksi: "+ idTransaksi);
        System.out.println("Jumlah Bayar: "+ jumlahBayar);
    }
    
    
}
