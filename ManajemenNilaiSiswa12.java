import java.util.Scanner;

public class ManajemenNilaiSiswa12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahSiswa = 0;
        double totalNilai = 0;
        int jumlahAtasRata = 0;
        int jumlahBawahRata = 0;

        System.out.println("Masukkan data siswa (ketik 'selesai' untuk berhenti):");
        while (true) {
            System.out.print("Nama siswa: ");
            String namaSiswa = scanner.nextLine();

            if (namaSiswa.equalsIgnoreCase("selesai")) {
                break;
            }
            System.out.print("Nilai siswa: ");
            double nilaiSiswa = scanner.nextDouble();
            scanner.nextLine(); 
            totalNilai += nilaiSiswa;
            jumlahSiswa++;

            if (nilaiSiswa > (totalNilai / jumlahSiswa)) {
                jumlahAtasRata++;
            } else {
                jumlahBawahRata++;
            }
        }

        double rataRataNilai = totalNilai / jumlahSiswa;
        boolean mayoritasAtasRata = jumlahAtasRata > (jumlahSiswa / 2);
        System.out.println("\nHasil:");
        System.out.println("Rata-rata nilai kelas: " + rataRataNilai);
        System.out.println("Jumlah siswa di atas rata-rata: " + jumlahAtasRata);
        System.out.println("Jumlah siswa di bawah rata-rata: " + jumlahBawahRata);

        if (mayoritasAtasRata) {
            System.out.println("Kelas memiliki mayoritas siswa di atas rata-rata.");
        } else {
            System.out.println("Kelas tidak memiliki mayoritas siswa di atas rata-rata.");
        }
    }
}