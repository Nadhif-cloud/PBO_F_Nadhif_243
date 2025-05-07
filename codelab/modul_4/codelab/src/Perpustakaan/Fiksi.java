package Perpustakaan;

// Subclass dari Buku untuk genre Fiksi
public class Fiksi extends Buku {

    public Fiksi(String judul, String penulis) {
        super(judul, penulis);
    }

    // Implementasi method abstrak secara spesifik untuk Fiksi
    @Override
    public void displayInfo() {
        System.out.println("Buku Fiksi: " + judul + " oleh " + penulis + " (Genre: Dongeng)");
    }
}
