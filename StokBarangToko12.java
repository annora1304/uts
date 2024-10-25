import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StokBarangToko12 {
       
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Barang> stokBarang = new HashMap<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Memasukkan Data Barang");
            System.out.println("2. Menampilkan Stok");
            System.out.println("3. Menangani Permintaan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    masukkanDataBarang(scanner, stokBarang);
                    break;
                case 2:
                    tampilkanStok(stokBarang);
                    break;
                case 3:
                    tanganiPermintaan(scanner, stokBarang);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }

    static void masukkanDataBarang(Scanner scanner, Map<String, Barang> stokBarang) {
        System.out.print("Masukkan nama barang: ");
        String namaBarang = scanner.nextLine();

        if (stokBarang.containsKey(namaBarang)) {
            System.out.println("Barang dengan nama tersebut sudah ada.");
            return;
        }

        System.out.print("Masukkan jumlah stok: ");
        int jumlahStok = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Masukkan harga per unit: ");
        int hargaPerUnit = scanner.nextInt();
        scanner.nextLine(); 

        Barang barang = new Barang(namaBarang, jumlahStok, hargaPerUnit);
        stokBarang.put(namaBarang, barang);

        System.out.println("Data barang berhasil ditambahkan.");
    }
    static
}