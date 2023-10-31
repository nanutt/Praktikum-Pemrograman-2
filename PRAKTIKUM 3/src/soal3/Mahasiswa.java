package soal3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Mahasiswa {
    private String nama;
    private String nim;
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    private ArrayList<Mahasiswa> mahasiswaList;
    private Map<String, Mahasiswa> nimMap;
    private Scanner input;
    public Mahasiswa() {
        mahasiswaList = new ArrayList<>();
        nimMap = new HashMap<>();
        input = new Scanner(System.in);
    }
    private void tambahMahasiswa(String nama, String nim) {
        if (nimMap.containsKey(nim)) {
            System.out.println("Mahasiswa dengan NIM " + nim + " sudah ada.");
        } else {
            Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
            mahasiswaList.add(mahasiswa);
            nimMap.put(nim, mahasiswa);
            System.out.println("Mahasiswa " + mahasiswa.getNama() + " ditambahkan.");
        }
    }
    private void hapusMahasiswa(String nim) {
        if (nimMap.containsKey(nim)) {
            Mahasiswa mahasiswa = nimMap.get(nim);
            mahasiswaList.remove(mahasiswa);
            nimMap.remove(nim);
            System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }
    private void cariMahasiswa(String nim) {
        if (nimMap.containsKey(nim)) {
            Mahasiswa mahasiswa = nimMap.get(nim);
            System.out.println("Mahasiswa dengan NIM " + nim + " ditemukan.");
            System.out.println("Nama: " + mahasiswa.getNama());
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }
    private void tampilkanDaftarMahasiswa() {
        if (mahasiswaList.isEmpty()) {
            System.out.println("Daftar mahasiswa kosong.");
        } else {
            System.out.println("Daftar Mahasiswa:");
            for (Mahasiswa mahasiswa : mahasiswaList) {
                System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
            }
        }
    }
    public void panggil() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine();
            if (pilihan == 0) {
                System.out.println("Terima kasih!");
                break;
            } else if (pilihan == 1) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = input.nextLine();
                System.out.print("Masukkan NIM Mahasiswa: ");
                String nim = input.nextLine();
                tambahMahasiswa(nama, nim);
            } else if (pilihan == 2) {
                System.out.print("Masukkan NIM Mahasiswa yang ingin dihapus: ");
                String nim = input.nextLine();
                hapusMahasiswa(nim);
            } else if (pilihan == 3) {
                System.out.print("Masukkan NIM Mahasiswa yang ingin dicari: ");
                String nim = input.nextLine();
                cariMahasiswa(nim);
            } else if (pilihan == 4) {
                tampilkanDaftarMahasiswa();
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
