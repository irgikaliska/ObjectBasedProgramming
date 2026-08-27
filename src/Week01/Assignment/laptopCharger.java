package Week01.Assignment;

public class laptopCharger extends Charger {
    private double voltage;
    private boolean isOverheating;

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public boolean checkOverheat(int currentTemp) {
        isOverheating = currentTemp > 60;
        return isOverheating;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Voltage: " + voltage + "V");
        System.out.println("Type: Laptop Charger");
        System.out.println("Overheating: " + isOverheating);
    }
}

