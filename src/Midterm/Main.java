package Midterm;

public class Main {
    public static void main(String[] args) {

        Battery battery = new Battery();
        PatrolRobot pr = new PatrolRobot("ASIMO", 2048, 150, new Battery(16000));

        pr.increasePower();

        System.out.println("Name: " + pr.name);
        System.out.println("CPUSpeed: " + pr.CPUspeed);
        System.out.println("Power: " + pr.power);

        // battery capacity
        System.out.println("Battery Capacity: " + pr.robotBattery.capacity);


    }
}
