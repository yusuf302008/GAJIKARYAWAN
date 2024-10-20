import java.util.Scanner;

public class TUGAS {

    public static void main(String[] args) {
        
        double hargaBarang,Diskon,jumlahBarang;
        Scanner Input = new Scanner(System.in);
        double hasil_akhir;
        System.out.println(" Masukkam Harga Barang ");
        hargaBarang = Input.nextDouble();
        System.out.println("masukkan Jumlah Barang");
        jumlahBarang = Input.nextDouble();
        System.out.println("Masukkan Diskon");
        Diskon = Input.nextDouble();
        Double totalharga;
        totalharga= hargaBarang * jumlahBarang;
        Diskon = Diskon / 100 * totalharga;
        hasil_akhir = totalharga - Diskon;
        System.out.println("Total harganya adalah"+hasil_akhir);
    }
}