import java.util.Scanner;
public class Mahasiswa08 {
    public Mahasiswa08() {

    }

    public Mahasiswa08(String nm,String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println(" IPK: " + ipk);
        System.out.println("Kelas: " + kelas);

    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk=ipkBaru;
        } else{
            System.out.println("ipk tidak valid.Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner  (System.in);
         Mahasiswa08 mahasiswa1 = new Mahasiswa08();
         mahasiswa1.nama = "ganang ";
         mahasiswa1.nim = "244107060008 ";
         mahasiswa1.ipk = 3.4;
         mahasiswa1.kelas = "SIB-1G";

         System.out.println ("Informasi Mahasiswa Sebelum Perubahan: ");
         mahasiswa1.tampilkanInformasi();

         System.out.print("masukkan IPK Baru: ");
         double ipkBaru = sc.nextDouble();
         mahasiswa1.updateIpk(ipkBaru);
         
         System.out.println("informasi Mahasiswa Sesudah Perubahan:  ");
         mahasiswa1.tampilkanInformasi();

         


    }
}