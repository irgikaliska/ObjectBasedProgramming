package Week02.Assignment;

public class Rent {
    public int id, amountToPay, rentDuration, pricePerDay;
    public String memberName, gameName;

    public void displayData(){
        System.out.println("ID            : " + id);
        System.out.println("Member Name   : " + memberName);
        System.out.println("Game name     : " + gameName);
        System.out.println("Amount To Pay : " + amountToPay);
    }

    public int calculateAmount(){
        amountToPay = pricePerDay * rentDuration;
        return amountToPay;
    }
}
