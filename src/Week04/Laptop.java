package Week04;

public class Laptop {
    String brand;
    Processor proc;

    public Laptop() {

    }

    public Laptop(String brand, Processor proc) {
        this.brand = brand;
        this.proc = proc;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setProc(Processor proc){
        this.proc = proc;
    }

    public Processor getProc() {
        return proc;
    }

    public void info() {
        System.out.println("Laptop Brand = " + brand);
        proc.info();
    }
}
