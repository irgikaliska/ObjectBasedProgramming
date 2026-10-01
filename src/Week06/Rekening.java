package Week06;

public class Rekening {
    protected int saldo;

    public int getSaldo(){
        return saldo;
    }

    public void simpanUang(int jumlah){
        saldo += jumlah;
    }

    public void ambilUang(int jumlah){
        saldo -= jumlah;
    }
}
