import java.util.Scanner;
public class PRAK103_2210817120009_NajahMaisyaroh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int bilanganAwal = input.nextInt();
        int i = 0;
        int bilangan = bilanganAwal;
        do {
            if (bilangan % 2 != 0) {
                System.out.print(bilangan + ",");
                i++;
            }
            bilangan++;
        } while (i < N);
        System.out.println();
    }
}
