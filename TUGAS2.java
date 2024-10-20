import java.util.Scanner;
public class TUGAS2 {
    public static void main(String[] args) {
        int jam_kerja;
        int tarif_per_jam;
        double bruto;
        double netto;
        double pembagi = 10;
        double hasil_akhir;
        Scanner scan = new Scanner(System.in);


        System.out.println("Berapa lama jam kerjanya: ");
        jam_kerja = scan.nextInt();
        System.out.println("Berapa tarif per jam kerjanya: ");
        tarif_per_jam = scan.nextInt();
        bruto = jam_kerja * tarif_per_jam;
        System.out.println("Bruto adalah: " + bruto);
        pembagi = pembagi / 100;
        netto = bruto * pembagi;
        System.out.println("Netto adalah" + netto);
        hasil_akhir = bruto - netto;
        System.out.println("Hasil akhir adalah: " +hasil_akhir);

        

    }
}