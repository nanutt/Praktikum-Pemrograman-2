import java.util.Scanner;
public class PRAK104_2210817120009_NajahMaisyaroh{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String tanganAbu = input.nextLine();
        System.out.print("Tangan Bagas: ");
        String tanganBagas = input.nextLine();
        int skorAbu = 0;
        int skorBagas = 0;
        for (int i = 0; i < 3; i++) {
            char tanganAbuRonde = tanganAbu.charAt(i);
            char tanganBagasRonde = tanganBagas.charAt(i);
            if (tanganAbuRonde == tanganBagasRonde) {
                continue;
            } else if (tanganAbuRonde == 'B' && tanganBagasRonde == 'G' ||
                    tanganAbuRonde == 'G' && tanganBagasRonde == 'K' ||
                    tanganAbuRonde == 'K' && tanganBagasRonde == 'B') {
                skorAbu++;
            } else {
                skorBagas++;
            }
        }
        if (skorAbu > skorBagas) {
            System.out.println("Abu");
        } else if (skorBagas > skorAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
        input.close();
    }
}
