import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Management System for Students\n");

        StudentRepository repository = new StudentRepositoryImpl();

        try {
            
            System.out.println("CREANDO ESTUDIANTES...");
            Student andres = new Student("1234", "Andres", 27, "Java");
            Student mariana = new Student("4567", "Mariana", 26, "Java");
            Student carlos = new Student("7890", "Carlos", 23, "Python");

            repository.addStudent(andres);
            repository.addStudent(mariana);
            repository.addStudent(carlos);

            System.out.println("Estudiantes creados exitosamente!");
            System.out.println("Total de estudiantes: " + repository.getAllStudents().size());
            System.out.println();

            
            System.out.println("LISTA DE TODOS LOS ESTUDIANTES:");
            List<Student> todos = repository.getAllStudents();
            for (Student s : todos) {
                System.out.println("  • " + s);
            }
            System.out.println();

            
            System.out.println("BUSCANDO ESTUDIANTE POR ID");
            Student encontrado = repository.findById("1234");
            if (encontrado != null) {
                System.out.println("Encontrado: " + encontrado);
            } else {
                System.out.println("No encontrado");
            }
            System.out.println();

            
            System.out.println("ACTUALIZANDO ESTUDIANTE");
            Student andresActualizado = new Student("1234", "Andres Felipe", 28, "Java Spring");
            repository.updateStudent(andresActualizado);
            System.out.println("Estudiante actualizado: " + repository.findById("1234"));
            System.out.println();

            
            System.out.println("ELIMINANDO ESTUDIANTE");
            boolean eliminado = repository.removeStudent("4567");
            if (eliminado) {
                System.out.println("Estudiante Mariana eliminada exitosamente");
            } else {
                System.out.println("No se pudo eliminar");
            }
            System.out.println("Total de estudiantes restantes: " + repository.getAllStudents().size());
            System.out.println();

            
            System.out.println("LISTA FINAL DE ESTUDIANTES:");
            List<Student> finales = repository.getAllStudents();
            for (Student s : finales) {
                System.out.println("  • " + s);
            }
            System.out.println();


            try {
                Student duplicado = new Student("1234", "Otro Andres", 25, "C++");
                repository.addStudent(duplicado);
            } catch (IllegalArgumentException e) {
                System.out.println("Validación correcta - ID duplicado: " + e.getMessage());
            }

            try {
                repository.findById("");
            } catch (IllegalArgumentException e) {
                System.out.println("Validación correcta - ID vacío: " + e.getMessage());
            }

            try {
                new Student("", "", -5, "");
            } catch (IllegalArgumentException e) {
                System.out.println("Validación correcta - Datos inválidos: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("ERROR INESPERADO: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
