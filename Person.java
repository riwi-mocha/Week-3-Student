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
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }


}
class Student extends Person{
    String age;
    int degree;
    ArrayList<String> qualifications = new ArrayList<>();
    
    public Student(String id,String name,int age){
        super(id, name, age);
    }
    
}