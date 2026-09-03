package Week02.Assignment;

public class TestLingkaran {
    public static void main(String[] args) {

        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.r = 5;
        System.out.printf("Luas: %.2f\n", lingkaran1.hitungLuas());
        System.out.printf("Keliling: %.2f\n", lingkaran1.hitungKeliling());
    }
}
