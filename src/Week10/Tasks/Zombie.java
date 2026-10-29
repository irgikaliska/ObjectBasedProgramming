package Week10.Tasks;

public abstract class Zombie implements Destroyable{
    protected int health, level;

    public abstract void heal();

    @Override
    public abstract void destroyed();

    public String getZombieInfo() {
        return "Health = " + health + "\nLevel = " + level + "\n";
    }
}
