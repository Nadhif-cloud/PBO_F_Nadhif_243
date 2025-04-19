class User {
    private String nama; // Variabel untuk menyimpan nama pengguna
    private String nim; // Variabel untuk menyimpan NIM pengguna

    // Konstruktor untuk menetapkan nama dan NIM saat objek dibuat
    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Metode untuk mendapatkan nama pengguna
    public String getNama() {
        return nama;
    }

    // Metode untuk mengubah nama pengguna
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode untuk mendapatkan NIM pengguna
    public String getNim() {
        return nim;
    }

    // Metode untuk mengubah NIM pengguna
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Metode login untuk memeriksa apakah nama dan NIM cocok
    public boolean login(String inputNama, String inputNim) {
        return this.nama.equals(inputNama) && this.nim.equals(inputNim);
    }

    // Metode untuk menampilkan informasi pengguna
    public void displayInfo() {
        System.out.println("Informasi Pengguna:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}