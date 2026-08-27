package Week01.Assignment;

public class Demo {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp();
        lamp1.setColor("White");
        lamp1.setBrightness(80);
        lamp1.turnOn();
        lamp1.printInfo();

        System.out.println();

        Backpack bag1 = new Backpack();
        bag1.setMaterial("Canvas");
        bag1.setColor("Black");
        bag1.openZipper();
        bag1.printInfo();

        System.out.println();

        phoneCharger charger1 = new phoneCharger();
        charger1.setBrand("Anker");
        charger1.setOutputWatt(20);
        charger1.setConnectorType("USB-C");
        charger1.setFastChargeSupported("yes");
        charger1.printInfo();

        System.out.println();

        laptopCharger charger2 = new laptopCharger();
        charger2.setBrand("HP");
        charger2.setOutputWatt(120);
        charger2.setVoltage(19.5);
        charger2.checkOverheat(90);
        charger2.printInfo();
    }
}
