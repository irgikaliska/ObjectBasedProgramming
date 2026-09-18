package Week04;

public class Cars {
    private String brand;
    private Engine engine;

    public Cars(String brand) {
        this.brand = brand;
        this.engine = new Engine(); // Engine created HERE, inside Car itself
    }
    public Cars(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

        public void displayInfo() {
        System.out.println("Car: " + brand);
        System.out.println("Engine: " + engine.getType());
    }
}
