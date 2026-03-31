class Pelanggan {
    private String nama;
    private String noHP;
    private int saldo;

    // Constructor
    public Pelanggan(String nama, String noHP) {
        this.nama = nama;
        this.noHP = noHP;
        this.saldo = 0; // saldo awal 0
        System.out.println("Pelanggan berhasil dibuat:");
        System.out.println("Nama: " + nama);
        System.out.println("No HP: " + noHP);
        System.out.println("Saldo awal: Rp " + saldo);
        System.out.println();
    }

    // Method Top Up
    public void topUp(int jumlah) {
        System.out.println("Melakukan Top Up: Rp " + jumlah);

        if (jumlah < 10000) {
            System.out.println("❌ Gagal! Minimum top up adalah Rp 10.000");
        } else {
            saldo += jumlah;
            System.out.println("✅ Top up berhasil!");
            System.out.println("Saldo sekarang: Rp " + saldo);
        }
        System.out.println();
    }

    // Method Bayar Tagihan
    public void bayarTagihan(int jumlah) {
        System.out.println("Membayar tagihan: Rp " + jumlah);

        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("✅ Pembayaran berhasil!");
            System.out.println("Sisa saldo: Rp " + saldo);
        } else {
            System.out.println("❌ Pembayaran gagal! Saldo tidak mencukupi.");
            System.out.println("Saldo saat ini: Rp " + saldo);
        }
        System.out.println();
    }

    public int getSaldo() {
        return saldo;
    }
}

// Class utama untuk simulasi
public class DuitKuApp {
    public static void main(String[] args) {

        // 1. Anton daftar
        Pelanggan anton = new Pelanggan("Anton", "081234567");

        // 2. Top up 50.000
        anton.topUp(50000);

    
        anton.bayarTagihan(60000);

        anton.topUp(20000);

        anton.bayarTagihan(60000);

        System.out.println("=== SALDO AKHIR ANTON ===");
        System.out.println("Rp " + anton.getSaldo());
    }
}
