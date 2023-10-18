import java.util.Scanner;
public class PRAK005_2210817120009_NajahMaisyaroh {
    public static void main(String[] agrs) {
        String MakFav, Hobi;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Makanan Favorit: ");
        MakFav = keyboard.nextLine();
        System.out.print("Masukan Hobi: ");
        Hobi = keyboard.nextLine();
        System.out.println("Aku Suka Makan "+ MakFav + ", dan Hobiku "+ Hobi);
    }
}
