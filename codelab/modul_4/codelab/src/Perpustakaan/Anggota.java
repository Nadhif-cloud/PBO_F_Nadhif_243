package Perpustakaan;

// Kelas Anggota mengimplementasikan interface Peminjaman
public class Anggota implements Peminjaman {
    private String nama;
    private String idAnggota;

    // Konstruktor untuk menginisialisasi data anggota
    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    // Menampilkan informasi anggota
    public void tampilkanInfo() {
        System.out.println("Anggota: " + nama + " (ID: " + idAnggota + ")");
    }

    // Overloading: method pertama hanya menerima judul buku
    public void pinjamBuku(String judul) {
        System.out.println(nama + " meminjam buku berjudul: " + judul);
    }

    // Overloading: method kedua menerima judul buku dan durasi
    @Override
    public void pinjamBuku(String judul, int durasi) {
        System.out.println(nama + " meminjam buku \"" + judul + "\" selama " + durasi + " hari.");
    }

    // Implementasi method dari interface
    @Override
    public void kembalikanBuku(String judul) {
        System.out.println(nama + " mengembalikan buku berjudul: " + judul);
    }
}
