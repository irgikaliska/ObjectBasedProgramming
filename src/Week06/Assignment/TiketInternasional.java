package Week06.Assignment;

public class TiketInternasional extends TiketPesawat {
    protected String nomorPaspor;
    protected int asuransi;

    public TiketInternasional() {
    }

    public TiketInternasional(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar,
                              String maskapai, int beratBagasi, String nomorPaspor, int asuransi) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar, maskapai, beratBagasi);
        this.nomorPaspor = nomorPaspor;
        this.asuransi = asuransi;
    }

    public void tampilInternasional() {
        System.out.println("====== Tiket Pesawat Internasional ======");
        super.tampilPesawat();
        System.out.printf("%-14s = %s%n", "Nomor Paspor", nomorPaspor);
        System.out.printf("%-14s = %d%n", "Asuransi", asuransi);
        int totalBayar = hargaDasar + hitungBiayaBagasi() + asuransi;
        System.out.printf("%-14s = %d%n", "Total Bayar", totalBayar);
    }
}
