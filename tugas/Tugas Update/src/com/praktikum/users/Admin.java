package com.praktikum.users;

import com.praktikum.actions.AdminActions;

import java.util.Scanner;

public class Admin extends User implements AdminActions {
    String username;
    String password;
    Scanner input = new Scanner(System.in);

    public Admin(String username, String password){
        super(username, password);
        this.username = username;
        this.password = password;
    }

    @Override
    public void login(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username: ");
        String Username = input.nextLine();
        System.out.print("Masukkan Password: ");
        String Password = input.nextLine();

        if(Username.equals(username) && Password.equals(password)){
            displayInfo();

        }else{
            System.out.println("Username dan Password yang anda masukkan salah!");
        }

        DisplayAppMenu();

    }


    @Override
    public void DisplayAppMenu(){
        Scanner input = new Scanner(System.in);
        int pilih;

        do{
            System.out.println("Masukkan Pilihan: ");
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("3. Logout");
            System.out.print("Pilih(1-3): ");
            pilih = input.nextInt();



            if (pilih == 1) {
                manageItem();
            } else if (pilih == 2) {
                manageUsers();
            } else if (pilih == 3) {
                System.out.println(">> Terimakasih <<");
            } else {
                System.out.println(">> Data yang Anda Masukkan Salah <<");
            }
        }while(pilih !=0);

    }

    @Override
    public void manageItem(){
        System.out.println("======================================");
        System.out.println("  Fitur kelola barang belum Tersedia  ");
        System.out.println("======================================");
    }

    @Override
    public void manageUsers(){
        System.out.println("======================================");
        System.out.println("  Fitur kelola Mahasiswa belum Tersedia  ");
        System.out.println("======================================");
    }

    @Override
    public void displayInfo(){
        System.out.println("Login Admin Berhasil!");
}
}
