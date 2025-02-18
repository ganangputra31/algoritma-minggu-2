import java.util.Scanner;
public class matakuliahmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        matakuliah mk1 = new matakuliah();
        System.out.println ("informasi mata kuiah : ");
        mk1.tampilInformasi();

        matakuliah mk2 = new matakuliah("SISOP","Sistem Operasi", 3, 4 );
        System.out.println("Informasi Mata Kuliah Setelah Inisialisasi:");
        mk2.tampilInformasi();

        System.out.print("Masukkan SKS baru untuk Sistem Operasi : ");
        int sksBaru = sc.nextInt();
        mk2.ubahSKS(sksBaru);
        mk2.tampilInformasi();

        System.out.print("Masukkan jumlah jam tambahan per minggu: ");
        int tambahanJam = sc.nextInt();
        mk2.tambahJumlahJam(tambahanJam);
        mk2.tampilInformasi();

        System.out.print("Masukkan jumlah jam yang ingin dikurangi: ");
        int penguranganJam = sc.nextInt();
        mk2.kurangiJumlahJam(penguranganJam);
        mk2.tampilInformasi();
    
    }
}
