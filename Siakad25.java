import java.util.Scanner;

public class Siakad25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

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
        System.out.print("Masukkan Nilai Ujiant\t: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        System.out.printf("Output:\nNama\t: %s\nNIM\t: %s\nKelas\t: %s\nAbsen\t: %s\nNilai Akhir\t: %s", nama, nim, kelas, absen, nilaiAkhir);

    }
}