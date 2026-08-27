package Week01.Assignment;

public class Charger {
    private String brand;
    public int outputWatt;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOutputWatt(int outputWatt) {
        this.outputWatt = outputWatt;
    }


    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Output: " + outputWatt + "W");
    }
}


