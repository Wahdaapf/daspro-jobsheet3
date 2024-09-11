import java.util.Scanner;

public class Listrik25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaListrik = 1500, jumlahListrik, totalHargaListrik;
        boolean statusListrik;

        System.out.print("Masukkan Jumlah Listrik (kWh)\t\t: ");
        jumlahListrik = sc.nextInt();

        if(jumlahListrik > 500) {
            statusListrik = true;
        } else {
            statusListrik = false;
        }

        totalHargaListrik = jumlahListrik * hargaListrik;

        System.out.printf("\nOutput:\n\nApakah Listrik Melebihi 500 kWh?\t: %s\nJumlah Listrik\t\t\t\t: %s\nHarga Listrik (kWh)\t\t\t: %s\nTotal Bayar Listrik\t\t\t: %s", statusListrik, jumlahListrik, hargaListrik, totalHargaListrik);

    }
}
