import java.util.HashMap;
import java.util.Scanner;

public class ManajemenStokBarang {

    static class Barang {
        String nama;
        int jumlah;
        double harga;

        public Barang(String nama, int jumlah, double harga) {
            this.nama = nama;
            this.jumlah = jumlah;
            this.harga = harga;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Barang> stokMap = new HashMap<>();

        while (true) {
            System.out.println("Pilih aksi:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Lihat Stok");
            System.out.println("3. Keluar");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                   
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan jumlah stok: ");
                    int jumlah = scanner.nextInt();

            }
        }
    }
}