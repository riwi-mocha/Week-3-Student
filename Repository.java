import java.util.List;

public interface Repository {
    
    void create(Student  Student);       
    
    Student readId(String id);      

    void update(String Student); 

    void delete(String id);   

    List<Student> readAll();      
}
