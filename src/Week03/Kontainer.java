package Week03;

public class Kontainer {
    private String nomorResi, namaPemilik;
    private double kapasitasMaksimal, beratMuatanSaatIni;

    public Kontainer(String nomorResi, String namaPemilik, double kapasitasMaksimal){
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
    }
    public String getNamaPemilik(){
        return namaPemilik;
    }
    public double getKapasitasMaksimal(){
        return kapasitasMaksimal;
    }
    public double getBeratMuatanSaatIni(){
        return beratMuatanSaatIni;
    }
    public void tambahMuatan(double muatanBaru){
        if(muatanBaru > kapasitasMaksimal){
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer");
        } else if (beratMuatanSaatIni + muatanBaru > kapasitasMaksimal) {
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer");
        } else{
            beratMuatanSaatIni += muatanBaru;
        }
    }
    public void turunkanMuatan(double muatanBaru){
        if(muatanBaru > beratMuatanSaatIni * 0.5){
            System.out.println("Sorry, for safety reasons, a single cargo unloading operation cannot exceed 50% of the current load!");
        }
        else{
            beratMuatanSaatIni -= muatanBaru;
        }
    }
}
