package Perpustakaan;

// Interface untuk fitur peminjaman
public interface Peminjaman {
    void pinjamBuku(String judul);         // Method untuk meminjam buku

    // Overloading: method kedua menerima judul buku dan durasi
    void pinjamBuku(String judul, int durasi);

    void kembalikanBuku(String judul);     // Method untuk mengembalikan buku
}
