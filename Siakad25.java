import java.util.Scanner;

public class Siakad25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.print("Masukkan Nama\t\t: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM\t\t: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas\t\t: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan Nomor Absen\t: ");
        absen = sc.nextByte();
        System.out.print("Masukkan Nilai Kuis\t: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas\t: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS\t: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS\t: ");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = (nilaiKuis / 100 * 20) + (nilaiTugas / 100 * 15) + (nilaiUTS / 100 * 30) + (nilaiUAS / 100 * 35);

        System.out.printf("\nOutput:\n\nNama\t\t: %s\nNIM\t\t: %s\nKelas\t\t: %s\nAbsen\t\t: %s\nNilai Akhir\t: %s", nama, nim, kelas, absen, nilaiAkhir);

    }
}