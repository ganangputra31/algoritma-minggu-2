public class Dosen08 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen08() {
        this.idDosen = "784";
        this.nama = "Hendra Pradibta, SE., M.Sc.";
        this.statusAktif = false;
        this.tahunBergabung = 2008;
        this.bidangKeahlian = "Analisa Proses Bisnis ";
    }
    public Dosen08(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    public void tampilInformasi() {
        System.out.println("ID Dosen         : " + idDosen);
        System.out.println("Nama Dosen       : " + nama);
        System.out.println("Status Aktif     : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung  : " + tahunBergabung);
        System.out.println("Bidang Keahlian  : " + bidangKeahlian);
        System.out.println("========================================================");
    }
    public void aturStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status dosen berhasil diubah menjadi: " + (status ? "Aktif" : "Tidak Aktif"));
    }
    public int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - this.tahunBergabung;
    }
    public void ubahBidangKeahlian(String bidangBaru) {
        this.bidangKeahlian = bidangBaru;
        bidangBaru = "Basis Data";
        System.out.println("Bidang keahlian berhasil diperbarui menjadi: " + bidangBaru);
    }
}
