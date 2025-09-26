package ActivityMS;

public class Main {
    public static void main(String[] args) {
        StudentRepository repository = new InMemoryStudentRepository();

        Student student1 = new Student("Samuel", "1", "Computer Science");
        Student student2 = new Student("Wazowsky", "2", "Scarer");
        Student student3 = new Student("Diomedes", "3", "Vallenatero");
        Student student4 = new Student("Caleb", "3", "Enginneer");

        repository.saveStudent(student1);
        repository.saveStudent(student2);
        repository.saveStudent(student3);
        repository.saveStudent(student4);

        System.out.println("All Students:");
        for (Student student : repository.getAllStudents()) {
            student.getDetails();
            System.out.println("-----");
        }

        System.out.println("Get Student by ID 2:");
        Student retrievedStudent = repository.getStudentById("2");
        if (retrievedStudent != null) {
            retrievedStudent.getDetails();
        } else {
            System.out.println("Student not found.");

            System.out.println("-----");
            System.out.println("Update Student with ID 3:");
            Student updatedStudent = new Student("Diomedes", "3", "Medicine");
            repository.updateStudent(updatedStudent);
            Student retrievedUpdatedStudent = repository.getStudentById("3");
            if (retrievedUpdatedStudent != null) {
                retrievedUpdatedStudent.getDetails();
            } else {
                System.out.println("Student not found.");
                System.out.println("-----");
                System.out.println("Delete Student with ID 1:");
                repository.deleteStudentById("1");
                Student deletedStudent = repository.getStudentById("1");
                if (deletedStudent != null) {
                    deletedStudent.getDetails();
                } else {
                    System.out.println("Student not found.");
                }
            }
        }

        System.out.println("-----");
        System.out.println("All Students after deletion:");
        for (Student student : repository.getAllStudents()) {
            student.getDetails();
            System.out.println("-----");

        }
    }
}