package Perpustakaan;

// Kelas abstrak yang menjadi dasar semua jenis buku
public abstract class Buku {
    protected String judul;
    protected String penulis;

    // Konstruktor untuk inisialisasi judul dan penulis
    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    // Method abstrak yang akan diimplementasikan oleh subclass
    public abstract void displayInfo();
}
