import java.util.Scanner;

public class Kafe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti, nominalInt;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga;
        float diskon = 10 / 100f;
        byte totalByte;

        System.out.print("Masukkan Keanggotaan (true/false)\t: ");
        keanggotaan = sc.nextBoolean();
        System.out.print("Masukkan Jumlah Pembelian Kopi\t\t: ");
        jmlKopi = sc.nextInt();
        System.out.print("Masukkan Jumlah Pembelian Teh\t\t: ");
        jmlTeh = sc.nextInt();
        System.out.print("Masukkan Jumlah Pembelian Roti\t\t: ");
        jmlRoti = sc.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        totalHarga = totalHarga - (totalHarga * diskon);
        // totalHarga = Math.round(totalHarga);

        nominalInt = (int) totalHarga;
        totalByte = (byte) totalHarga; 

        System.out.printf("\nOutput:\n\nKeanggotaan Pelanggan\t: %s\nItem Pembelian\t\t: %s Kopi, %s Teh, %s Roti\nNominal Bayar Rp.\t: %s", keanggotaan, jmlKopi, jmlTeh, jmlRoti, totalByte);
    }
}