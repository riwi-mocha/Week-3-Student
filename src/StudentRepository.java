import java.util.List;

public interface StudentRepository {

    //  Añadir un estudiante
    void addStudent(Student student);

    // Buscar estudiante por ID
    Student findById(String studentId);

    // Actualizar un estudiante existente
    void updateStudent(Student student);

    // Eliminar estudiante por ID
    boolean removeStudent(String studentId);

    // Obtener todos los estudiantes
    List<Student> getAllStudents();
}
