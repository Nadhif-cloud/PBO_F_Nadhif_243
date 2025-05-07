package Perpustakaan;

// Subclass dari Buku untuk genre Non-Fiksi
public class NonFiksi extends Buku {

    public NonFiksi(String judul, String penulis) {
        super(judul, penulis);
    }

    // Implementasi method abstrak secara spesifik untuk Non-Fiksi
    @Override
    public void displayInfo() {
        System.out.println("Buku Non-Fiksi: " + judul + " oleh " + penulis + " (Bidang: Sejarah & Ilmu Pengetahuan )");
    }
}
