import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class AdminRepository implements Repository {
    private HashMap<String, Student> students = new HashMap<>();

    @Override
    public void create(Student Student) {
        students.put(Student.getId(), Student);
    }

    @Override
    public void update(String id, Student Student) {
        students.put(id, Student);
    }

    @Override
    public void delete(String id) {
        students.remove(id);
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