import java.util.*;

public class StudentRepositoryImpl implements StudentRepository{

    private Map<String, Student> studentsMap;
    private List<Student> studentList;

    // Constructor
    public StudentRepositoryImpl(){
        this.studentsMap = new HashMap<>();
        this.studentList = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student){
       
        if (student == null) {
            throw new IllegalArgumentException("El estudiante no puede ser null");
        }

        String id = student.getStudentID();

        
        if (studentsMap.containsKey(id)) {
            throw new IllegalArgumentException("Estudiante con ID " + id + " ya existe");
        }

        
        studentsMap.put(id, student);
        studentList.add(student);
    }

    @Override
    public Student findById(String studentId){
        if (studentId == null || studentId.trim().isEmpty()){
            throw new IllegalArgumentException("El ID no puede estar vacío");
        }

        return studentsMap.get(studentId);
    }

    @Override
    public void updateStudent(Student student){
        if (student == null) {
            throw new IllegalArgumentException("El estudiante no puede ser null");
        }

        String id = student.getStudentID();

        if (!studentsMap.containsKey(id)) {
            throw new IllegalArgumentException("Estudiante con ID " + id + " no existe");
        }

        
        studentsMap.put(id, student);

        // Actualizar en la lista
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentID().equals(id)) {
                studentList.set(i, student);
                break;
            }
        }
    }

    @Override
    public boolean removeStudent(String studentId){
        if (studentId == null || studentId.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID no puede estar vacío");
        }

        if (!studentsMap.containsKey(studentId)) {
            return false; // No existe
        }

        // Eliminar del Map
        studentsMap.remove(studentId);

        // Eliminar de la list
        studentList.removeIf(student -> student.getStudentID().equals(studentId));

        return true;
    }

    @Override
    public List<Student> getAllStudents(){
        return new ArrayList<>(studentList);
    }
}