package Midterm;

public class PatrolRobot extends Robot{
    Battery robotBattery;

    public PatrolRobot(String name, int cpuSpeed, int power, Battery battery){
        this.name = "PATROL " + name;
        CPUspeed = cpuSpeed;
        this.power = power;
        this.robotBattery = battery;
    }

    public void increasePower(){
        power += 20;
    }

}
