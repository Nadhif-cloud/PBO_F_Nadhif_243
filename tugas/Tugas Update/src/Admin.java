// Kelas Admin sebagai turunan dari User
class Admin extends User {
    private String password; // Variabel tambahan untuk menyimpan password admin

    // Konstruktor untuk menetapkan nama, NIM, dan password saat objek Admin dibuat
    public Admin(String nama, String nim, String password) {
        super(nama, nim); // Memanggil konstruktor User untuk nama dan NIM
        this.password = password;
    }

    // Override metode login agar admin masuk menggunakan username dan password
    @Override
    public boolean login(String inputNama, String inputPassword) {
        return getNama().equals(inputNama) && this.password.equals(inputPassword);
    }

    // Override metode displayInfo untuk menampilkan pesan khusus untuk admin
    @Override
    public void displayInfo() {
        System.out.println("Login Admin Berhasil");
        System.out.println("Username: " + getNama());
    }
}