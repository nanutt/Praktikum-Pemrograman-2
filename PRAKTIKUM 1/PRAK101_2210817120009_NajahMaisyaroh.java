import java.util.Scanner;
import java.util.Locale;

public class PRAK101_2210817120009_NajahMaisyaroh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = input.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = input.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = input.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = input.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        int tinggiBadan = input.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        double beratBadan = input.nextDouble();
        System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + getBulan(bulanLahir) + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");
        input.close();
    }
    public static String getBulan(int bulan) {
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        return namaBulan[bulan - 1];
    }
}
