package com.praktikum.users;


import com.praktikum.actions.MahasiswaActions;

import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {
    String nama;
    String nim;
    public Mahasiswa(String nama, String nim){
        super(nama, nim);
        this.nama = nama;
        this.nim = nim;

    }

    @Override
    public void login(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa: ");
        String Nama = input.nextLine();
        System.out.print("Masukkan Nim Mahasiswa: ");
        String Nim = input.nextLine();

        if(Nama.equals(nama) && Nim.equals(nim)){
            displayInfo();

        }else{
            System.out.println("Nama dan Nim Mahasiswa salah!");
        }

        DisplayAppMenu();


    }
    @Override
    public void DisplayAppMenu(){
        Scanner input = new Scanner(System.in);
        int pilih;
        System.out.println();
        System.out.println("======================================");
        System.out.println("|| Data Kehilangan Barang Mahasiswa ||");
        System.out.println("======================================");

        do{
            System.out.println("Masukkan Pilihan: ");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("3. Logout");
            System.out.print("Pilih(1-3): ");
            pilih = input.nextInt();

            System.out.println();

            if (pilih == 1) {
                reportItem();
            } else if (pilih == 2) {
                reportedItems();
            } else if (pilih == 3) {
                System.out.println(">> Terimakasih <<");
            } else {
                System.out.println("===================================");
                System.out.println("|| Data yang Anda Masukkan Salah ||");
                System.out.println("===================================");
            }
        }while(pilih !=3);

    }


    @Override
    public void reportItem() {

    }

    @Override
    public void viewReportItem(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Barang: ");
        String barang = input.nextLine();

        System.out.print("Masukkan Deskripsi Barang: ");
        String deskripsi = input.nextLine();

        System.out.print("Lokasi Barang terakhir/ditemukan: ");
        String lokasi = input.nextLine();

        System.out.println("====================================");
        System.out.println("|| Data laporan diterima. Terimakasih! ||");
        System.out.println("====================================");

        System.out.println();
    }



    @Override
    public void reportedItems(){

        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }

    @Override
    public void displayInfo(){
        System.out.println();
        System.out.println(">> Login Mahasiswa Berhasil <<");
        System.out.println(">> Informasi Pengguna <<");
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);

}
}