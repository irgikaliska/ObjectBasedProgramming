package Week04.Assignment;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String info() {
        return "Teacher: " + name + " (" + subject + ")";
    }
}
