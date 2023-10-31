package soal1;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Random;
public class Dadu {
    private int nilai;
    public Dadu() {
        acakNilai();
    }
    public void acakNilai() {
        Random r = new Random();
        nilai = r.nextInt(6) + 1;
    }
    public int getNilai() {
        return nilai;
    }
    public void panggil() {
        Scanner angka = new Scanner(System.in);
        int jumlahDadu = angka.nextInt();
        LinkedList<Dadu> daduList = new LinkedList<>();
        int total = 0;
        for (int i = 1; i <= jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            daduList.add(dadu);
            System.out.println("Dadu ke-" + i + " bernilai " + dadu.getNilai());
            total += dadu.getNilai();
        }
        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}
