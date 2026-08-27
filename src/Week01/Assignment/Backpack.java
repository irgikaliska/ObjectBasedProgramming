package Week01.Assignment;

public class Backpack {
    private String material, color;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void openZipper () {
        System.out.println("Bag zipper is opened");
    }

    public void printInfo () {
        System.out.println();
        System.out.println("Backpack Material:" + material);
        System.out.println("Backpack Color:" + color);
    }
}

