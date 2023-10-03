import java.util.Scanner;
public class PRAK102_2210817120009_NajahMaisyaroh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angkaAwal = input.nextInt();
        int i = 1;
        while (i <= 11) {
            if (angkaAwal % 5 == 0) {
                System.out.print((angkaAwal / 5) - 1);
            } else {
                System.out.print(angkaAwal);
            }
            if (i % 11 == 0) {
                System.out.println();
            } else {
                System.out.print(",");
            }
            angkaAwal++;
            i++;
        }
        input.close();
    }
}

