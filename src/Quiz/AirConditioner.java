package Quiz;

public class AirConditioner {
    private String brand;
    private int productionYear;
    private Compressor mainCompressor;
    private Remote mainRemote;

    public AirConditioner(){

    }
    public AirConditioner(String brand, int yearprod, Compressor comp, Remote rmt) {
        this.brand = brand;
        productionYear = yearprod;
        mainCompressor = comp;
        mainRemote = rmt;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public Compressor getMainCompressor(){
        return mainCompressor;
    }

    public Remote getRemoteAC(){
        return mainRemote;
    }
}
