import java.util.Scanner;

// Kelas Admin
class Admin {
    private final String username = "Admin243";
    private final String password = "Password243";

    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}

// Kelas Mahasiswa
class Mahasiswa {
    private final String nama = "Ahmad Nadhif Zuvar";
    private final String nim = "202410370110243";

    public boolean login(String inputNama, String inputNIM) {
        return inputNama.equals(nama) && inputNIM.equals(nim);
    }

    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

// Kelas utama LoginSystem
public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();
        boolean ulangi = true;

        while (ulangi) {
            System.out.println("\n=== Sistem Login ===");
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Login sebagai Mahasiswa");
            System.out.print("Pilihan Anda (1/2): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Buang newline

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan Username: ");
                    String user = scanner.nextLine();
                    System.out.print("Masukkan Password: ");
                    String pass = scanner.nextLine();

                    if (admin.login(user, pass)) {
                        System.out.println("Login Admin berhasil!");
                        ulangi = false;
                    } else {
                        System.out.println("Login gagal! Username atau password salah.");
                    }
                }
                case 2 -> {
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();

                    if (mahasiswa.login(nama, nim)) {
                        mahasiswa.displayInfo();
                        ulangi = false;
                    } else {
                        System.out.println("Login gagal! Nama atau NIM salah.");
                    }
                }
                default -> System.out.println("Pilihan tidak valid. Silakan pilih 1 atau 2.");
            }

            if (ulangi) {
                System.out.print("Coba lagi? (y/n): ");
                String jawab = scanner.nextLine();
                if (jawab.equalsIgnoreCase("n")) {
                    ulangi = false;
                }
            }
        }

        System.out.println("Terima kasih telah menggunakan sistem login.");
        scanner.close();
    }
}
