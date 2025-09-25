import javax.swing.JOptionPane;

public class main {

    public static adminRepository adminRepository = new adminRepository();

    public static void exit() {
        JOptionPane.showMessageDialog(null, "Hasta pronto", "Saliendo...", JOptionPane.INFORMATION_MESSAGE);
        
    }

    
    public static void showStudents() {
        StringBuilder students = new StringBuilder("Estudiantes:\n");
        if (adminRepository.readAll().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay Estudiantes registrados", "Estudiantes",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }


        for (Student student : adminRepository.readAll()) {
            String lineStudent = "ID: " + student.getId() +
                    " - Nombre: " + student.getName() +
                    " - Edad: " + student.getAge() +
                    " - Email: " + student.getEmail() +
                    " - Profesión: " + student.getProfession() + "\n";

            students.append(lineStudent);
        }
        JOptionPane.showMessageDialog(null, students.toString(), "Todos los estudiantes",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void searchStudent(){
        String id = JOptionPane.showInputDialog(null, "ID del estudiante: ", "Buscar estudiante",
                JOptionPane.QUESTION_MESSAGE);
        if (id.isEmpty() || id == null) {
            JOptionPane.showMessageDialog(null, "El ID no puede estar vacio, intentalo de nuevo.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (adminRepository.readId(id)== null) {
            JOptionPane.showMessageDialog(null, "El estudiante con ID: "+id+" no esta registrado", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
            adminRepository.readId(id).info();

        
    }

    public static void addStudent(){
        String name = JOptionPane.showInputDialog(null, "Nombre del estudiante: ", "Agregar estudiante",
                JOptionPane.QUESTION_MESSAGE);
        if (name.isEmpty() || name == null) {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacio, intentalo de nuevo.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    public static void main(String[] args) {
                 
         Student Adrian = new Student("123", "Adrian", 22, "Adrian@gmail.com",
         "Desarrollo de software");
         Student Alesis = new Student("456", "Alesis", 20, "Alesis@gmail.com",
         "Desarrollo Web");
         Student Isabella = new Student("789", "Isabella", 18, "Isabella@gmail.com",
         "Ingenieria Aeronautica");
         
         adminRepository.create(Adrian);
         adminRepository.create(Alesis);
         adminRepository.create(Isabella);
         
         System.out.println("\nLista de estudiantes:");
         for (Student student : adminRepository.readAll()) {
         System.out.println("ID: " + student.getId() + " - Nombre: " +
         student.getName() + " - Edad: " + student.getAge() + " - Email: " +
         student.getEmail() + " - Profesion: " + student.getProfession());
         }
         
         Student student = adminRepository.readId("123");
         if (student != null){
         System.out.println("\nEstudiante");
         System.out.println("ID: " + student.getId() + ", Nombre: " +
         student.getName() + ", Edad: "
         + student.getAge() + " - Email: " + student.getEmail() + " - Profesion: " +
         student.getProfession());
         }else{
         System.out.println("\nEstidiante no encontrado");
         }
         
         adminRepository.delete("456");
         System.out.println("\nLista de estudiantes:");
         for (Student student2 : adminRepository.readAll()) {
         System.out.println(
         "ID: " + student2.getId() + " - Nombre: " + student2.getName() + " - Edad: "
         + student2.getAge()
         + " - Email: " + student2.getEmail() + " - Profesion: " +
         student2.getProfession());
         }
         System.out.println("\nEstudiante actualizado");
         Student Pepe = new Student("123", "Pepe", 19, "Pepe@gmail.com", "Comedia");
         adminRepository.update(Pepe.getId(), Pepe);
         for (Student student2 : adminRepository.readAll()) {
         System.out.println(
         "ID: " + student2.getId() + " - Nombre: " + student2.getName() + " - Edad: "
         + student2.getAge()
         + " - Email: " + student2.getEmail() + " - Profesion: " +
         student2.getProfession());
         }
         
        String option;
        do {
            option = JOptionPane.showInputDialog(null, "Menu Principal\n" +
                    "1. Buscar Estudiante\n" +
                    "2. Agregar Estudiante\n" +
                    "3. Actualizar Estudiante\n" +
                    "4. Eliminar Estudiante\n" +
                    "5. Ver Todos los Estudiantes\n" +
                    "6. Salir", "Gestion De Estudiantes", JOptionPane.QUESTION_MESSAGE);

            if (option == null)
                break;

            switch (option) {
                case "1":
                    searchStudent();
                break;
                case "2":
                    addStudent();
                    break;
                case "3":
                    // ();
                    break;
                case "4":
                    // ();
                    break;
                case "5":
                    showStudents();
                    break;
                case "6":
                    exit();
                default:
                    break;
            }
        } while (!option.equals("6"));

    }
}
