package Tugas_18052026_Karyawan;

import java.util.Scanner;
public class MainKaryawan {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        Karyawan karyawan = null;

        System.out.println("===== SISTEM PENGGAJIAN KARYAWAN =====");

        System.out.print("Masukkan Nama Karyawan : ");
        String nama = input.nextLine();

        System.out.println("Pilih Jenis Karyawan");
        System.out.println("1. Karyawan Tetap");
        System.out.println("2. Karyawan Kontrak");
        System.out.print("Pilihan : ");
        int pilihan = input.nextInt();

        switch (pilihan) {

            case 1:
                // gaji sudah ditentukan
                System.out.println("KARYAWAN TETAP");
                karyawan = new KaryawanTetap(5000000, 0, nama, 0);
                break;

            case 2:
                // gaji sudah ditentukan
                System.out.println("KARYAWAN KONTRAK");
                System.out.print("Masukkan Jam Kerja : ");
                int jamKerja = input.nextInt();
                karyawan = new KaryawanKontrak(jamKerja, 50000,nama,0);
                break;

            default:
                System.out.println("Pilihan tidak tersedia");
        }
        karyawan.hitungGaji();
        
    }
}
