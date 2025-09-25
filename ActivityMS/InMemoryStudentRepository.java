package ActivityMS;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class InMemoryStudentRepository implements StudentRepository{
    private final Map<String, Student> studentStore;

    public InMemoryStudentRepository() {
        this.studentStore = new HashMap<>();
    }

    @Override
    public void saveStudent(Student student) {
    studentStore.put(student.getId(), student);
    }

    @Override
    public Student getStudentById(String id) {
        return studentStore.get(id);
    }

    @Override
    public void deleteStudentById(String id) {
        studentStore.remove(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentStore.put(student.getId(), student);
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentStore.values());
    }
}
