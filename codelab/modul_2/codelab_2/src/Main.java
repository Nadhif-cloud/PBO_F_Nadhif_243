import java.time.LocalTime;

// Kelas RekeningBank
class RekeningBank {
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    // Konstruktor
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("\n💰 Rekening Info 💰");
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Nama Pemilik   : " + namaPemilik);
        System.out.println("Saldo          : Rp" + saldo);
        System.out.println("=========================");
    }

    // Menyetor uang ke rekening
    public RekeningBank setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println("🔄 [" + LocalTime.now() + "] " + namaPemilik + " menyetor Rp" + jumlah);
        System.out.println("   ✅ Saldo sekarang: Rp" + saldo);
        return this;
    }

    // Menarik uang dari rekening
    public RekeningBank tarikUang(double jumlah) {
        if (jumlah > saldo) {
            System.out.println("❌ [" + LocalTime.now() + "] " + namaPemilik + " mencoba menarik Rp" + jumlah);
            System.out.println("   ❗ Gagal! Saldo tidak mencukupi.");
        } else {
            saldo -= jumlah;
            System.out.println("💸 [" + LocalTime.now() + "] " + namaPemilik + " menarik Rp" + jumlah);
            System.out.println("   ✅ Saldo sekarang: Rp" + saldo);
        }
        return this;
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Membuat dua rekening
        RekeningBank rekening1 = new RekeningBank("202410370110243", "Nadhif", 475000);
        RekeningBank rekening2 = new RekeningBank("202410370110245", "Agus", 800000);

        // Menampilkan informasi rekening awal
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Melakukan transaksi
        rekening1.setorUang(200000);
        rekening2.setorUang(500000);

        rekening1.tarikUang(300000);
        rekening2.tarikUang(1000000);

        // Menampilkan informasi rekening akhir
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}
