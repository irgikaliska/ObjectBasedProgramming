package Week04;

public class Carriage {
    private String code;
    private Seat[] seatArray;

    public Carriage(String code, int count) {
        this.code = code;
        this.seatArray = new Seat[count];
        this.initSeats();
    }

    private void initSeats() {
        for (int i = 0; i < seatArray.length; i++) {
            this.seatArray[i] = new Seat(String.valueOf(i + 1));
        }
    }

    public void setPassenger(Passenger passenger, int number) {
        if (this.seatArray[number - 1].getPassenger() == null) {
            this.seatArray[number - 1].setPassenger(passenger);
        } else {
            System.out.println("Seat " + number + " is already taken.");
        }
    }

    public String info() {
        String info = "";
        info += "Code: " + code + "\n";
        for (Seat seat : seatArray) {
            info += seat.info();
        }
        return info;
    }



}
