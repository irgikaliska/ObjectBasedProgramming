package Week07;

public class TestSegitiga {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println(s.totalSudut(90));         // 90
        System.out.println(s.totalSudut(60, 60));     // 60
        System.out.println(s.keliling(3, 4, 5));      // 12
        System.out.printf("%.2f%n", s.keliling(3, 4)); // 12.00
    }
}
