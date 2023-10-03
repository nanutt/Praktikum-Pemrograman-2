import java.util.Scanner;
import java.util.Locale;
public class PRAK105_2210817120009_NajahMaisyaroh {
    public static void main(String[] args) {
        final double PHI = 3.14;
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US); //
        System.out.print("Masukkan jari-jari: ");
        String jariJariStr = input.next();
        jariJariStr = jariJariStr.replace(',', '.');
        System.out.print("Masukkan tinggi: ");
        String tinggiStr = input.next();
        tinggiStr = tinggiStr.replace(',', '.');
        double jariJari = Double.parseDouble(jariJariStr);
        double tinggi = Double.parseDouble(tinggiStr);
        double volume = PHI * jariJari * jariJari * tinggi;
        System.out.printf(Locale.US, "Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", jariJari, tinggi, volume);
        input.close();
    }
}
