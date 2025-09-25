import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Person {
    private String id;
    private String name;

    public Person(String id,String name){
        this.id= id;
        this.name= name;
    }

    public String getId(){
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
   

}
class Student extends Person {
    private int age;
    private String email;
    private ArrayList<Double> qualifications = new ArrayList<>();
    private String profession;

    public Student(String id,String name,int age,String email,String profession){
        super(id, name);
        this.age= age;
        this.email= email;
        this.profession= profession;
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
    

}
class adminRepository implements Repository {
    private HashMap<String, Student> students = new HashMap<>();
    
    @Override
    public void create(Student Student) {
        students.put(Student.getId(), Student);
    }

    @Override
    public void update(String id) {
        students.get(id);
    }

    @Override
    public void delete(String id) {
        students.get(id);
    }
    @Override
    public Student readId(String id) {
        return students.get(id);
    }

    @Override
    public List<Student> readAll() {
        return new ArrayList<>(students.values());
    }
}