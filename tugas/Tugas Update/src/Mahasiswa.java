// Kelas Mahasiswa sebagai turunan dari User
class Mahasiswa extends User {
    // Konstruktor untuk menetapkan nama dan NIM saat objek Mahasiswa dibuat
    public Mahasiswa(String nama, String nim) {
        super(nama, nim); // Memanggil konstruktor User
    }

    // Override metode login agar mahasiswa masuk dengan nama dan NIM
    @Override
    public boolean login(String inputNama, String inputNim) {
        return getNama().equals(inputNama) && getNim().equals(inputNim);
    }

    // Override metode displayInfo untuk menampilkan informasi mahasiswa
    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa Berhasil");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }
}