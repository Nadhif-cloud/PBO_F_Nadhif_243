import java.util.Scanner; // Mengimpor Scanner agar pengguna bisa memasukkan data

// Kelas User sebagai dasar untuk Admin dan Mahasiswa
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

// Kelas utama untuk menjalankan sistem login
public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk mengambil input pengguna

        // Membuat objek Admin dan Mahasiswa dengan data awal
        Admin admin = new Admin("admin", "243", "admin123");
        Mahasiswa mahasiswa = new Mahasiswa("Nadhif", "243");

        // Menampilkan menu login agar pengguna memilih login sebagai Admin atau Mahasiswa
        System.out.println("=== Sistem Login ===");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih (1/2): ");
        int pilihan = input.nextInt(); // Mengambil input pilihan pengguna
        input.nextLine(); // Membersihkan buffer agar tidak terjadi error saat membaca teks berikutnya

        // Jika pengguna memilih login sebagai Admin
        if (pilihan == 1) {
            System.out.print("Masukkan Username: ");
            String username = input.nextLine(); // Meminta username dari pengguna
            System.out.print("Masukkan Password: ");
            String password = input.nextLine(); // Meminta password dari pengguna

            // Memeriksa apakah username dan password cocok
            if (admin.login(username, password)) {
                admin.displayInfo(); // Menampilkan pesan sukses jika login berhasil
            } else {
                System.out.println("Login Admin Gagal"); // Menampilkan pesan gagal jika login salah
            }

            // Jika pengguna memilih login sebagai Mahasiswa
        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama Mahasiswa: ");
            String nama = input.nextLine(); // Meminta nama mahasiswa dari pengguna
            System.out.print("Masukkan NIM Mahasiswa: ");
            String nim = input.nextLine(); // Meminta NIM mahasiswa dari pengguna

            // Memeriksa apakah nama dan NIM cocok
            if (mahasiswa.login(nama, nim)) {
                mahasiswa.displayInfo(); // Menampilkan pesan sukses jika login berhasil
            } else {
                System.out.println("Login Mahasiswa Gagal"); // Menampilkan pesan gagal jika login salah
            }

            // Jika pengguna memasukkan pilihan yang tidak valid
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        input.close(); // Menutup Scanner untuk menghindari kebocoran sumber daya
    }
}