import java.util.ArrayList;

public class Student extends Person {
    private int age;
    private String email;
    private ArrayList<Double> qualifications = new ArrayList<>();
    private String profession;

    public Student(String id, String name, int age, String email, String profession) {
        super(id, name);
        this.age = age;
        this.email = email;
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Double> getQualifications() {
        return qualifications;
    }

    public void setQualifications(double qualification) {
        this.qualifications.add(qualification);
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String info() {
        return "ID: " + getId() + " - Nombre: " + getName() + " - Edad: " + getAge() + " - Email: " + getEmail()
                + " - Profesión: " + getProfession();
    }

}
