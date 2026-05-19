package Tugas_18052026_Transportasi;

import java.util.Scanner;
public class MainTransportasi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Transportasi transportasi = null;

        System.out.println("===== APLIKASI TRANSPORTASI ONLINE =====");
        System.out.print("Nama Penumpang : ");
        String nama = input.nextLine();

        System.out.print("Tujuan : ");
        String tujuan = input.nextLine();

        System.out.println("\nPilih Transportasi");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("3. Bis");
        System.out.println("4. Kereta");
        System.out.print("Masukkan pilihan(1/2/3/4) : ");
        int pilihan = input.nextInt();

        input.nextLine();

        switch (pilihan) {
            case 1: System.out.println("== TRANSPORTASI MOBIL ==");
                    System.out.print("Masukkan Jumlah Kursi : ");
                    int kursi = input.nextInt();
                    transportasi = new Mobil(kursi, nama, tujuan);
                    break;

            case 2: System.out.println("== TRANSPORTASI MOTOR ==");
                    transportasi = new Motor("Andi", nama, tujuan, 50000);
                    break;

            case 3: System.out.println("== TRANSPORTASI BIS ==");
                    System.out.print("Masukkan Kelas Bis : ");
                    String kelasBis = input.nextLine();
                    transportasi = new Bis(kelasBis, nama, tujuan, 80000);
                    break;

            case 4: System.out.println("== TRANSPORTASI KERETA ==");
                    System.out.println("1. Ekonomi");
                    System.out.println("2. Bisnis");
                    System.out.println("3. Eksekutif");

                System.out.print("Pilih kelas kereta(1/2/3) : ");
                int pilihKelas = input.nextInt();
                input.nextLine();
                String kelasKereta = "";
                double biayaKereta = 0;

                switch (pilihKelas) {

                    case 1:
                        kelasKereta = "Ekonomi";
                        biayaKereta = 10000;
                        break;

                    case 2:
                        kelasKereta = "Bisnis";
                        biayaKereta = 20000;
                        break;

                    case 3:
                        kelasKereta = "Eksekutif";
                        biayaKereta = 35000;
                        break;
                }
                System.out.print("Masukkan Nomor Kursi : ");
                String nomorKursi = input.nextLine();
                transportasi = new Kereta(kelasKereta, nomorKursi, nama, tujuan, biayaKereta);
                break;

            default:
                System.out.println("Pilihan tidak tersedia");
        }
        transportasi.tampilInfo();
        

    }

}