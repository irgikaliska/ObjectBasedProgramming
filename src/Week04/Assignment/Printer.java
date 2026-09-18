package Week04.Assignment;

public class Printer {
    private String brand;

    public Printer(String brand) {
        this.brand = brand;
    }

    public void print(String content) {
        System.out.println("[" + brand + "] Printing: " + content);
    }
}
