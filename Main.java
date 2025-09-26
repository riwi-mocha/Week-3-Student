import javax.swing.JOptionPane;

public class Main {

    public static AdminRepository adminRepository = new AdminRepository();

    public static void exit() {
        JOptionPane.showMessageDialog(null, "Hasta pronto.", "Saliendo...", JOptionPane.INFORMATION_MESSAGE);
        
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
        if (adminRepository.readAll().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay Estudiantes registrados", "Estudiantes",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
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
            
            JOptionPane.showMessageDialog(null, adminRepository.readId(id).info(), "Buscar Estudiante",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void addStudent(){
        String id = JOptionPane.showInputDialog(null, "ID del estudiante: ", "Agregar estudiante",
                JOptionPane.QUESTION_MESSAGE);
        if (id.isEmpty() || id == null) {
            JOptionPane.showMessageDialog(null, "El ID no puede estar vacio, intentalo de nuevo.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (adminRepository.readId(id) != null) {
            JOptionPane.showMessageDialog(null, "El estudiante con ID: " + id + " ya esta registrado", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        //--------------------------------------------------------------------
        String name = JOptionPane.showInputDialog(null, "Nombre del estudiante: ", "Agregar estudiante",
                JOptionPane.QUESTION_MESSAGE);
        if (name.isEmpty() || name == null) {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacio, intentalo de nuevo.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        // --------------------------------------------------------------------
        int age;
        try {
            age = Integer.parseInt(JOptionPane.showInputDialog(null,"Edad del estudiante:","Agregar Estudiante",JOptionPane.QUESTION_MESSAGE));
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La edad debe ser un numero mayor a 14, intentalo de nuevo.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(age <= 14){
            JOptionPane.showMessageDialog(null, "La edad debe ser un numero mayor a 14, intentalo de nuevo.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                    return;
        }else if (age >60) {
            JOptionPane.showMessageDialog(null, "El estudiante no puede ser mayor a 60",
                    "Error",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        // --------------------------------------------------------------------
        String email = JOptionPane.showInputDialog(null, "Email del estudiante: ", "Agregar estudiante",
                JOptionPane.QUESTION_MESSAGE);
        if (email.isEmpty() || email == null) {
            JOptionPane.showMessageDialog(null, "El Email no puede estar vacio, intentalo de nuevo.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        // --------------------------------------------------------------------
        String profession = JOptionPane.showInputDialog(null, "Carrera del estudiante: ", "Agregar estudiante",
                JOptionPane.QUESTION_MESSAGE);
        if (profession.isEmpty() || profession == null) {
            JOptionPane.showMessageDialog(null, "La Carrera no puede estar vacia, intentalo de nuevo.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        // --------------------------------------------------------------------
        Student newStudent = new Student(id, name, age, email, profession);
        adminRepository.create(newStudent);
        JOptionPane.showMessageDialog(null,"Estudiante:\n"+ adminRepository.readId(id).info()+"\nAgregado correctamente", "Agregar Estudiante",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void deleteStudent(){
        if (adminRepository.readAll().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay Estudiantes registrados", "Estudiantes",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        String id = JOptionPane.showInputDialog(null, "ID del estudiante: ", "Eliminar estudiante",
                JOptionPane.QUESTION_MESSAGE);
        if (id.isEmpty() || id == null) {
            JOptionPane.showMessageDialog(null, "El ID no puede estar vacio, intentalo de nuevo.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (adminRepository.readId(id) == null) {
            JOptionPane.showMessageDialog(null, "El estudiante con ID: " + id + " no esta registrado", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null,"Estudiante:\n"+ adminRepository.readId(id).info()+"\nEliminado correctamente", "Eliminar Estudiante",JOptionPane.INFORMATION_MESSAGE);
        adminRepository.delete(id);
    }

    public static void updateStudent(){
        if (adminRepository.readAll().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay Estudiantes registrados", "Estudiantes",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        String id = JOptionPane.showInputDialog(null, "ID del estudiante: ", "Actualizar estudiante",
                JOptionPane.QUESTION_MESSAGE);
        if (id.isEmpty() || id == null) {
            JOptionPane.showMessageDialog(null, "El ID no puede estar vacio, intentalo de nuevo.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (adminRepository.readId(id) == null) {
            JOptionPane.showMessageDialog(null, "El estudiante con ID: " + id + " no esta registrado", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        //--------------------------------------------------------------------------------------------
        String name = JOptionPane.showInputDialog(null, "Nombre del estudiante: ", "Actualizar estudiante",
                JOptionPane.QUESTION_MESSAGE);
        if (name.isEmpty() || name == null) {
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacio, intentalo de nuevo.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        // --------------------------------------------------------------------
        int age;
        try {
            age = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad del estudiante",
                    "Actualizar Estudiante", JOptionPane.QUESTION_MESSAGE));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La edad debe ser un numero mayor a 14, intentalo de nuevo.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (age <= 14) {
            JOptionPane.showMessageDialog(null, "La edad debe ser un numero mayor a 14, intentalo de nuevo.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else if (age > 60) {
            JOptionPane.showMessageDialog(null, "El estudiante no puede ser mayor a 60",
                    "Error",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        // --------------------------------------------------------------------
        String email = JOptionPane.showInputDialog(null, "Email del estudiante: ", "Actualizar estudiante",
                JOptionPane.QUESTION_MESSAGE);
        if (email.isEmpty() || email == null) {
            JOptionPane.showMessageDialog(null, "El Email no puede estar vacio, intentalo de nuevo.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        // --------------------------------------------------------------------
        String profession = JOptionPane.showInputDialog(null, "Carrera del estudiante: ", "Actualizar estudiante",
                JOptionPane.QUESTION_MESSAGE);
        if (profession.isEmpty() || profession == null) {
            JOptionPane.showMessageDialog(null, "La Carrera no puede estar vacia, intentalo de nuevo.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        Student newStudent = new Student(id, name, age, email, profession);
        adminRepository.update(newStudent.getId(), newStudent);
        JOptionPane.showMessageDialog(null,"Estudiante:\n"+ adminRepository.readId(id).info()+"\nActualizado correctamente", "Actualizar Estudiante",JOptionPane.INFORMATION_MESSAGE);

    }

    public static void main(String[] args) {
                 
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
                    updateStudent();
                    break;
                case "4":
                    deleteStudent();
                    break;
                case "5":
                    showStudents();
                    break;
                case "6":
                    exit();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida, intentalo de nuevo.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (!option.equals("6"));

    }
}
