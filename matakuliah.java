public class matakuliah {
   String kodeMK;
   String nama;
   int sks;
   int jumlahjam;

   public matakuliah(){
    this.kodeMK = "SISOP";
    this.nama = "Sistem Operasi";
    this.sks = 4;
    this.jumlahjam = 6;

   }

    public matakuliah(String kodeMk, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMk;
        this.nama = nama;
        this.sks = sks;
        this.jumlahjam = jumlahJam;
    }
        
   

    public void tampilInformasi() {
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("SKS              : " + sks);
        System.out.println("Jumlah Jam/Minggu: " + jumlahjam);
    }
    public void ubahSKS(int sksBaru) {
        if (sksBaru > 0 && sksBaru <= 6) {
            this.sks = sksBaru;
            System.out.println("SKS berhasil diubah menjadi: " + sksBaru);
        } else {
            System.out.println("SKS tidak valid!");
        }
    }

    public void tambahJumlahJam(int tambahanJam) {
        if (tambahanJam > 0) {
            this.jumlahjam += tambahanJam;
            System.out.println("Jumlah jam berhasil ditambahkan. Sekarang: " + this.jumlahjam + " jam/minggu");
        } else {
            System.out.println("Jumlah jam tidak valid!.");
        }
    }

    public void kurangiJumlahJam(int penguranganJam) {
        if (penguranganJam > 0 && (this.jumlahjam - penguranganJam) >= 0) {
            this.jumlahjam -= penguranganJam;
            System.out.println("Jumlah jam berhasil dikurangi. Sekarang: " + this.jumlahjam + " jam/minggu");
        } else {
            System.out.println("Pengurangan tidak valid! .");
        }
    }

}
