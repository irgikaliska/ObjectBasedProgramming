package Week06;

public class Angel extends Character{
    protected int potion;

    public Angel(String name, int level, int health, int potion){
        super.name = name;
        super.level = level;
        super.health = health;
        this.potion = potion;

    }

    public void cure(Character target){
        target.health = 100;
        potion -= 1;
    }
}
