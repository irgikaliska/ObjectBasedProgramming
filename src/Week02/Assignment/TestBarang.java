package Week02.Assignment;

public class TestBarang {
    public static void main(String[] args) {
        Barang barang1 = new Barang();
        barang1.kode = "B001";
        barang1.namaBarang = "Kaos Polos";
        barang1.hargaDasar = 50000;
        barang1.diskon = 0.1f;

        barang1.tampilData();
    }
}
