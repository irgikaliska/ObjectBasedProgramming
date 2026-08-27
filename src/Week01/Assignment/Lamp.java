package Week01.Assignment;

public class Lamp {
    private String color;
    private int brightness;

    public void setColor (String color) {
        this.color = color;
    }

    public void setBrightness (int brightness) {
        this.brightness = brightness;
    }

    public void turnOn() {
        System.out.println(color + " lamp turned on");
    }
    public void printInfo(){
        System.out.println();
        System.out.println("Lamp color: " + color);
        System.out.println("Brightness: " + brightness);
    }
}
