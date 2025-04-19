import java.util.Scanner;
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