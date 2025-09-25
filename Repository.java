import java.util.List;

public interface Repository {
    
    void create(Student  Student);       
    
    Student readId(int id);      

    void update(Student Student); 

    void Delete(String id);   

    List<Student> readAll();      
}
