package Week04;

public class MainExperiment6 {
    public static void main(String[] args) {
        Laptops laptop = new Laptops("Thinkpad");
        Printer printer = new Printer("Epson L3110");
        laptop.printDocument(printer, "Report.pdf");
    }
}
