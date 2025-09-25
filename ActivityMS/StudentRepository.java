package ActivityMS;

import java.util.List;

public interface StudentRepository {
    void saveStudent(Student student);
    Student getStudentById(String id);
    void deleteStudentById(String id); //Optional way of deleting
    void updateStudent(Student student); //Optional method
    List <Student> getAllStudents();
}
