package Week06;

public class Human extends Character{
    protected int strength;

    public Human(String name, int level, int health, int strength){
        super.name = name;
        super.level = level;
        super.health = health;
        this.strength = strength;
    }

    public void specialAttack(Character target){
        target.health -= 10 + strength;

    }
}
