package Week03;
import java.util.Scanner;
public class TestLogistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9998", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + "kg");

//        System.out.println("\nMemasukkan muatan baru seberat 6.000 kg...");
//        kontainerAlfa.tambahMuatan(6000);
//        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + "kg");
//
//        System.out.println("\nMemasukkan muatan baru seberat 4.000 kg...");
//        kontainerAlfa.tambahMuatan(4000);
//        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + "kg");
//
//        System.out.println("\nMembongkar muat/menurunkan barang seberat 500 kg...");
//        kontainerAlfa.turunkanMuatan(500);
//        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + "kg");
//
//        System.out.println("\nMembongkar muat/menurunkan barang seberat 1.500 kg...");
//        kontainerAlfa.turunkanMuatan(1500);
//        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + "kg");

        boolean doAgain = true;
        do{
            System.out.println("Load or Unload?");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("Load")){
                System.out.println("How much do you want to load?");
                double load = sc.nextDouble();
                kontainerAlfa.tambahMuatan(load);
                System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + "kg");
            }
            else if (input.equalsIgnoreCase("Unload")){
                System.out.println("How much do you want to unload?");
                double unload = sc.nextDouble();
                kontainerAlfa.turunkanMuatan(unload);
                System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + "kg");
            }
            else {
                System.out.println("Input is invalid");
            }
            sc.nextLine();
            System.out.println("Do you want to do another process? (Yes/No)");
            String again = sc.nextLine();
            if(again.equalsIgnoreCase("Yes")){
                doAgain = true;
            } else if (again.equalsIgnoreCase("No")) {
                doAgain = false;
                System.out.println("Exiting...");
            } else{
                System.out.println("Input is invalid");
                doAgain = false;
            }
        }
        while(doAgain);
    }
}
