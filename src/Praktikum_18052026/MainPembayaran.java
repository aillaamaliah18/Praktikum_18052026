package Praktikum_18052026;

import java.util.Scanner;
public class MainPembayaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        //Deklarasi variabel objek dengan inisialisasi nilai awal
        Pembayaran pembayaran = null;
        
        System.out.println("-----Sistem Pembayaran Toko Online-----");
        System.out.println("Masukkan ID Transaksi = ");
        String id = scanner.nextLine();
        
        System.out.println("Masukkan Jumlah Bayar : ");
        double jumlah = scanner.nextDouble();
        
        System.out.println("Pilih metode pembayaran : ");
        System.out.println("1. Transfer Bank ");
        System.out.println("2. Kartu Kredit ");
        System.out.println("3. E-Wallet ");
        System.out.println("Pilih metode pembayaran anda (1/2/3) : ");
        int pilihan = scanner.nextInt();
        
        scanner.nextLine();
        
        switch(pilihan){
            case 1 : System.out.println("Metode Transfer Bank");
                     System.out.println("Masukkan nama bank tujuan = ");
                     String bank = scanner.nextLine();
                     pembayaran = new PembayaranTransfer(bank,jumlah,id);
                     break;
                     
             case 2 :System.out.println("Metode Kartu Kredit");
                     System.out.println("Masukkan nomor kartu kredit = ");
                     String no = scanner.nextLine();
                     pembayaran = new PembayaranKartuKredit(no,jumlah,id);
                     break;
                     
             case 3 : System.out.println("Metode E-Wallet");
                     System.out.println("Masukkan nama E-Wallet (OVO,Shopeepay, Dana, dll) = ");
                     String nama = scanner.nextLine();
                     pembayaran = new PembayaranTransfer(nama,jumlah,id);
                     break;
        }
        
        System.out.println("\n===Konfirmasi Bukti Pembayaran===");
        pembayaran.prosesPembayaran();
        
    }
    
}
