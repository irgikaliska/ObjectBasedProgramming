package Week10.Tasks;

public class JumpingZombie extends Zombie{
    public JumpingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal(){
        int percent = 0;
        if(level == 1) percent = 30;
        else if (level == 2) percent = 40;
        else if (level == 3) percent = 50;
        health += health * percent / 100;
    }

    @Override
    public void destroyed(){
        health -= health * 10 / 100;
    }

    @Override
    public String getZombieInfo(){
        return "Jumping Zombie Data =\n" + super.getZombieInfo();
    }
}
