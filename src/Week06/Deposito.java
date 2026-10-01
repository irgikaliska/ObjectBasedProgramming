package Week06;

public class Deposito extends Rekening{
    private double bungaPerBulan;
    int tenor;

    public Deposito(int saldoAwal, int masaTenor){
        saldo = saldoAwal;
        tenor = masaTenor;
        bungaPerBulan = 0.05;
    }

    public double getNilaiBunga(){
        return saldo * bungaPerBulan * tenor / 12;
    }


}
