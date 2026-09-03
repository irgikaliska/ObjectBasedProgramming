package Week02.Assignment;

public class Lingkaran {
    public double phi = Math.PI;
    public double r;

    public double hitungLuas(){
        double area = phi * r * r;
        return area;
    }

    public double hitungKeliling(){
        double perimeter = 2 * phi * r;
        return perimeter;
    }
}
