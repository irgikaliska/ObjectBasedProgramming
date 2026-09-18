package Week04.Assignment;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void printReportCard(Printer printer) {
        printer.print(name + "'s Report Card");
    }
}
