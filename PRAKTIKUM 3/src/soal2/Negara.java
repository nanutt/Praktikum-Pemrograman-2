package soal2;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
public class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;
    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }
    public Negara() {
    }
    public String getNama() {
        return nama;
    }
    public String getJenisKepemimpinan() {
        return jenisKepemimpinan;
    }
    public String getNamaPemimpin() {
        return namaPemimpin;
    }
    public int getTanggalKemerdekaan() {
        return tanggalKemerdekaan;
    }
    public int getBulanKemerdekaan() {
        return bulanKemerdekaan;
    }
    public int getTahunKemerdekaan() {
        return tahunKemerdekaan;
    }
    public void panggil() {
        Scanner input = new Scanner(System.in);
        int jumlah = 0;
        jumlah = input.nextInt();
        input.nextLine();
        LinkedList<Negara> negaraList = new LinkedList<>();
        HashMap<Integer, String> bulanMap = new HashMap<>();
        bulanMap.put(1, "Januari");
        bulanMap.put(2, "Februari");
        bulanMap.put(3, "Maret");
        bulanMap.put(4, "April");
        bulanMap.put(5, "Mei");
        bulanMap.put(6, "Juni");
        bulanMap.put(7, "Juli");
        bulanMap.put(8, "Agustus");
        bulanMap.put(9, "September");
        bulanMap.put(10, "Oktober");
        bulanMap.put(11, "November");
        bulanMap.put(12, "Desember");
        for (int i = 1; i <= jumlah; i++) {
            String nama = input.nextLine();
            String jenisKepemimpinan = input.nextLine();
            String namaPemimpin = input.nextLine();
            int tanggalKemerdekaan = 0;
            int bulanKemerdekaan = 0;
            int tahunKemerdekaan = 0;
            if (!jenisKepemimpinan.equals("monarki")) {
                tanggalKemerdekaan = input.nextInt();
                bulanKemerdekaan = input.nextInt();
                tahunKemerdekaan = input.nextInt();
                input.nextLine();
            }
            Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            negaraList.add(negara);
        }
        for (Negara negara : negaraList) {
            System.out.print("Negara " + negara.getNama() + " mempunyai ");
            if (negara.getJenisKepemimpinan().equals("monarki")) {
                System.out.println("Raja bernama " + negara.getNamaPemimpin() + "\n");
            } else if (negara.getJenisKepemimpinan().equals("presiden")) {
                System.out.println("Presiden bernama " + negara.getNamaPemimpin());
            }else if (negara.getJenisKepemimpinan().equals("perdana menteri")){
                System.out.println("Perdana Menteri bernama " + negara.getNamaPemimpin());
            }
            if (!negara.getJenisKepemimpinan().equals("monarki")) {
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggalKemerdekaan() + " " + bulanMap.get(negara.getBulanKemerdekaan()) + " " + negara.getTahunKemerdekaan() + "\n");
            }
        }
    }
}