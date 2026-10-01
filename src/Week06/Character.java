package Week06;

public class Character {
    protected String name;
    protected int level, health;

    public void attack(Character target){
        target.health -= 10;
    }

    public void showStatus(){
        System.out.println("Name: " + name + " Health: " + health);
    }
}
