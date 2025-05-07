package com.praktikum.main;


import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;

import java.util.Scanner;

public class LoginSystem {

    public static void main(String [] args){

        Admin admin1 = new Admin("Admin123", "123");
        Mahasiswa mahasiswa1 = new Mahasiswa("Nadhif", "202410370110243");
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Pilih login(1/2): ");
        int login = input.nextInt();

        if(login == 1){
            admin1.login();

        }else if(login == 2){
            mahasiswa1.login();
            mahasiswa1.displayInfo();
        }else {
            System.out.println("Data tidak Valid!");
     }




}
}