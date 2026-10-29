package Week09.Assignment;

public class Singa extends Binatang implements IKarnivora {
    private String suara;
    private String warnaBulu;

    public Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Food: Meat");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Name: " + nama);
        System.out.println("Number of Legs: " + jmlKaki);
        System.out.println("Sound: " + suara);
        System.out.println("Fur Colour: " + warnaBulu);
    }

    public void displayData() {
        System.out.println("Type: Carnivore");
        displayMakan();
        displayBinatang();
    }
}