package soal1;
import java.util.Scanner;
public class HewanPeliharaan {
    String nama;
    String ras;
    public HewanPeliharaan(String n, String r) {
        nama = n;
        ras = r;
    }
    public HewanPeliharaan() {

    }
    public void display() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        nama = input.nextLine();
        System.out.print("Ras: ");
        ras = input.nextLine();
        System.out.println("\nDetail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}