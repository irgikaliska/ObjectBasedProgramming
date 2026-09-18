package Week04.Assignment;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Handoko", "Mathematics");
        Classroom room = new Classroom("Room 101", teacher, 5);
        room.info();

        System.out.println();

        Student student = new Student("Irgi");
        Printer printer = new Printer("Epson L3110");
        student.printReportCard(printer);
    }
}