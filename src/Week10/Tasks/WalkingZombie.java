package Week10.Tasks;

public class WalkingZombie extends Zombie{
    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal(){
        int percent = 0;
        if (level == 1) percent = 20;
        else if (level == 2) percent = 30;
        else if (level == 3) percent = 40;
        health += health * percent / 100;
    }

    @Override
    public void destroyed(){
        health -= health * 20 / 100;
    }

    @Override
    public String getZombieInfo(){
        return "Walking Zombie Data =\n" + super.getZombieInfo();
    }
}
