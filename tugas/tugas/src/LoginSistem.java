import java.util.Scanner; //library untuk scanf dll
public class LoginSistem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ulangi = true;

        while (ulangi) {
            System.out.println("Pilih login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    // Login sebagai Admin
                    System.out.print("Masukkan username: ");
                    String username = scanner.nextLine();
                    System.out.print("Masukkan password: ");
                    String password = scanner.nextLine();
                    if (username.equals("Admin243") && password.equals("Password243")) {
                        System.out.println("Login Admin berhasil!");
                        ulangi = false; // Berhenti setelah berhasil login
                    } else {
                        System.out.println("Login gagal! Username atau password salah.");
                    }
                    break;

                case 2:
                    // Login sebagai Mahasiswa
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    if (nama.equals("Ahmad Nadhif Zuvar") && nim.equals("202410370110243")) {
                        System.out.println("Login Mahasiswa berhasil!");
                        System.out.println("Nama: " + nama);
                        System.out.println("NIM: " + nim);
                        ulangi = false; // Berhenti setelah berhasil login
                    } else {
                        System.out.println("Login gagal! Nama atau NIM salah.");
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            // Tanyakan apakah pengguna ingin mengulangi
            if (ulangi) {
                System.out.print("Ingin mencoba lagi? (y/n): ");
                String jawaban = scanner.nextLine();
                if (jawaban.equalsIgnoreCase("n")) {
                    ulangi = false;
                }
            }
        }

        scanner.close();
    }
}
