package Week02.Assignment;

public class Barang {
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual(){
        double sellingPrice = hargaDasar - (diskon * hargaDasar);
        return (int) sellingPrice;
    }

    public void tampilData(){
        System.out.println("Kode        : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : " + hargaDasar);
        System.out.println("Harga Jual  : " + hitungHargaJual());
    }

}
