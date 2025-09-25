import java.util.ArrayList;

public abstract class Person {
    private String id;
    private String name;
    private int age;

    public Person(String id,String name, int age){
        this.name= name;
        this.age= age;
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
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

}
class Student extends Person{
    String age;
    int degree;
    String email;
    ArrayList<String> qualifications = new ArrayList<>();
    
    public Student(String id,String name,int age){
        super(id, name, age);
    }
    
}