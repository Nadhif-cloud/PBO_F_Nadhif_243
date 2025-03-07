import java.util.Scanner;  // mengimpor Scanner untuk membaca input dari pengguna
import java.time.LocalDate; // mengimpor LocalDate untuk mendapatkan tahun saat ini

public class DataDiri {
    public static void main(String[] args) {
        // membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // meminta pengguna memasukkan nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // meminta pengguna memasukkan jenis kelamin dengan huruf 'P' (Perempuan) atau 'L' (Laki-laki)
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        // meminta pengguna memasukkan tahun lahir dalam bentuk angka
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // menutup Scanner setelah selesai membaca input untuk menghindari kebocoran sumber daya
        scanner.close();

        // mengambil tahun sekarang dari sistem komputer
        int tahunSekarang = LocalDate.now().getYear();

        // menghitung umur dengan mengurangi tahun sekarang dengan tahun lahir
        int umur = tahunSekarang - tahunLahir;

        // menentukan teks jenis kelamin berdasarkan input pengguna
        String jenisKelaminTeks;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') { // jika pengguna memasukkan 'L' atau 'l', maka jenis kelamin adalah Laki-laki
            jenisKelaminTeks = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') { // jika pengguna memasukkan 'P' atau 'p', maka jenis kelamin adalah Perempuan
            jenisKelaminTeks = "Perempuan";
        } else { // jika pengguna memasukkan selain 'P' atau 'L', maka jenis kelamin tidak diketahui
            jenisKelaminTeks = "Tidak diketahui";
        }

        // menampilkan data yang telah dikumpulkan dari pengguna
        System.out.println("\nData Diri:");
        System.out.println("Nama            : " + nama); // menampilkan nama pengguna
        System.out.println("Jenis Kelamin   : " + jenisKelaminTeks); // menampilkan jenis kelamin dalam bentuk teks
        System.out.println("Umur            : " + umur + " tahun"); // menampilkan umur dalam satuan tahun
}
}