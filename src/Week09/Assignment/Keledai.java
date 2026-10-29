package Week09.Assignment;

public class Keledai extends Binatang implements IHerbivora {
    private String suara;
    private String warnaBulu;

    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Food: Plants");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Name: " + nama);
        System.out.println("Number of Legs: " + jmlKaki);
        System.out.println("Sound: " + suara);
        System.out.println("Fur Colour: " + warnaBulu);
    }

    public void displayData() {
        System.out.println("Type: Herbivore");
        displayMakan();
        displayBinatang();
    }
}
