package Week02.Assignment;

public class TestRent {
    public static void main(String[] args) {
        Rent rent1 = new Rent();
        rent1.id = 1;
        rent1.memberName = "Agus";
        rent1.gameName = "GTA VI";
        rent1.rentDuration = 3;
        rent1.pricePerDay = 10000;
        rent1.calculateAmount();
        rent1.displayData();
    }
}
