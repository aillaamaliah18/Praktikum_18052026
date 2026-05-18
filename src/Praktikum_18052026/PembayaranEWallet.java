package Praktikum_18052026;

public class PembayaranEWallet extends Pembayaran {
    private String namaEWallet;
    
    public PembayaranEWallet(double jumlahBayar, String idTransaksi){
        super(jumlahBayar, idTransaksi);
        this.namaEWallet = namaEWallet;
    }
        

    public String getNamaEWallet() {
        return namaEWallet;
    }

    public void setNamaEWallet(String namaEWallet) {
        this.namaEWallet = namaEWallet;
    }
    
    @Override
    public void prosesPembayaran(){
        System.out.println("Pembayaran melalui E-Wallet: ");
        System.out.println("E-Wallet: "+ namaEWallet);
        System.out.println("ID Transaksi: "+ idTransaksi);
        System.out.println("Jumlah Bayar: "+ jumlahBayar);
    }
}
