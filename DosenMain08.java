import java.util.Scanner;
public class DosenMain08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    Dosen08 dsn1 = new Dosen08();
    System.out.println("Informasi Dosen Default:");
    dsn1.tampilInformasi();

    Dosen08 dsn2 =new Dosen08("987","Meyti Eka Apriyani ST., MT.", true, 2009, "Sistem operasi" );
    System.out.println("Informasi Dosen Setelah diubah:");
    dsn2.tampilInformasi();

    System.out.print("Ubah status aktif dosen (true/false): ");
        boolean statusBaru = sc.nextBoolean();
        dsn2.aturStatusAktif(statusBaru);
        dsn2.tampilInformasi();

    System.out.print("Masukkan tahun sekarang: ");
        int tahunSekarang = sc.nextInt();
        int masaKerja = dsn2.hitungMasaKerja(tahunSekarang);
        System.out.println("Masa kerja dosen: " + masaKerja + " tahun");

        System.out.println("Masukkan bidang keahlian baru: ");

        String bidangBaru = sc.nextLine();
        dsn2.ubahBidangKeahlian( bidangBaru = "Basis Data");
        dsn2.tampilInformasi();





    }
}
