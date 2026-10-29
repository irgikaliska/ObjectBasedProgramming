package Week09.Assignment;

public class Gorilla extends Binatang implements IKarnivora, IHerbivora {
    private String suara;
    private String warnaBulu;

    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    // One method satisfies both interfaces (same signature)
    @Override
    public void displayMakan() {
        System.out.println("Food: Meat + Plants");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Name: " + nama);
        System.out.println("Number of Legs: " + jmlKaki);
        System.out.println("Sound: " + suara);
        System.out.println("Fur Colour: " + warnaBulu);
    }

    public void displayData() {
        System.out.println("Type: Carnivore + Herbivore");
        displayMakan();
        displayBinatang();
    }
}
