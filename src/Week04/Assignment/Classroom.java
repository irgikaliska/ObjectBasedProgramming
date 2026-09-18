package Week04.Assignment;

public class Classroom {
    private String roomName;
    private Teacher teacher;
    private Desk[] desks;

    public Classroom(String roomName, Teacher teacher, int deskCount) {
        this.roomName = roomName;
        this.teacher = teacher;
        this.desks = new Desk[deskCount];
        initDesks();
    }

    private void initDesks() {
        for (int i = 0; i < desks.length; i++) {
            desks[i] = new Desk(String.valueOf(i + 1));
        }
    }

    public void info() {
        System.out.println("Room: " + roomName);
        System.out.println(teacher.info());
        for (Desk d : desks) {
            System.out.println(d.info());
        }
    }
}
