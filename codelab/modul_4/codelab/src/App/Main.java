package App;


import Perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        // Polimorfisme: objek dari subclass disimpan dalam referensi superclass
        Buku buku1 = new Buku("Madilog", "Tan Malaka") {
            @Override
            public void displayInfo() {

            }
        };
        Buku buku2 = new Buku("Hainuwele: Sang Putri Kelapa", "Lilis Hu") {
            @Override
            public void displayInfo() {

            }
        };

        // Menampilkan informasi kedua buku
        buku1.displayInfo();
        buku2.displayInfo();

        // Membuat dua anggota perpustakaan
        Anggota anggota1 = new Anggota("Nadhif", "243");
        Anggota anggota2 = new Anggota("Suryanto", "345");

        // Menampilkan informasi anggota
        anggota1.tampilkanInfo();
        anggota2.tampilkanInfo();

        // Demonstrasi overloading dan implementasi interface
        anggota1.pinjamBuku("Madilog");
        anggota2.pinjamBuku("Hainuwele: Sang Putri Kelapa", 7);

        anggota1.kembalikanBuku("Madilog");
        anggota2.kembalikanBuku("Hainuwele: Sang Putri Kelapa");
    }
}
