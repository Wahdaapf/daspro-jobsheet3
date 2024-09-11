import java.util.Scanner;

public class Gaji25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalJamKerja, upahPerJam, totalGaji, totalGajiAkhir, totalPajak, totalBonus, pajak = 5/100f, bonus = 10/100f;

        System.out.print("Masukkan Jumlah Jam Kerja\t: ");
        totalJamKerja = sc.nextDouble();
        System.out.print("Masukkan Upah Jam Kerja\t\t: ");
        upahPerJam = sc.nextDouble();

        totalGaji = totalJamKerja * upahPerJam;
        totalBonus = totalGaji * bonus;
        totalPajak = (totalGaji + totalBonus) * pajak;
        totalGajiAkhir = totalGaji + totalBonus - totalPajak;

        System.out.printf("\nOutput:\n\nTotal Jam Kerja\t\t\t: %.2f\nUpah Per Jam\t\t\t: Rp.%.2f\nBonus\t\t\t\t: 10%%\nPajak\t\t\t\t: 5%%\nTotal Gaji\t\t\t: Rp.%.2f\nTotal Bonus\t\t\t: Rp.%.2f\nTotal Gaji + Bonus\t\t: Rp.%.2f\nTotal Pajak\t\t\t: Rp.%.2f\nTotal Gaji Akhir\t\t: Rp.%.2f",
        totalJamKerja, upahPerJam, totalGaji, totalBonus, (totalGaji + totalBonus), totalPajak, totalGajiAkhir);    

    }
}
