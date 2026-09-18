package Week03.MotorEncapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void printStatus(){
        if (kontakOn){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan  " + kecepatan + "\n");
    }
    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if(kontakOn){
            if(kecepatan > 100){
                System.out.println("Tidak bisa diatas 100");
            }else{
                kecepatan += 5;
            }
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin off \n");
        }
    }
    public void kurangiKecepatan(){
        if(kontakOn){
            kecepatan -= 5;
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin off \n");
        }
    }
}
