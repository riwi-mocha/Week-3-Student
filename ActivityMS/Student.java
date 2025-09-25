package ActivityMS;

public class Student extends Person {
    private String major;

    public Student(String name, String id, String major) {
        super(name, id);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    void getDetails() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + getId());
        System.out.println("Major: " + major);
    }
}
