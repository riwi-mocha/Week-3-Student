public class main {
    public static void main(String[] args) {
        adminRepository adminRepository = new adminRepository();

        Student Adrian = new Student("123", "Adrian", 22, "Adrian@gmail.com", "Desarrollo de software");
        Student Alesis = new Student("456", "Alesis", 20, "Alesis@gmail.com", "Desarrollo Web");
        Student Isabella = new Student("789", "Isabella", 18, "Isabella@gmail.com", "Ingenieria Aeronautica");

        adminRepository.create(Adrian);
        adminRepository.create(Alesis);
        adminRepository.create(Isabella);

        System.out.println("\nLista de estudiantes:");
        for (Student student : adminRepository.readAll()) {
            System.out.println("ID: " + student.getId() + " - Nombre: " + student.getName() + " - Edad: " + student.getAge() + " - Email: " + student.getEmail() + " - Profesion: " + student.getProfession());
        }

        Student student = adminRepository.readId("123");
        if (student != null){
            System.out.println("\nEstudiante");
            System.out.println("ID: " + student.getId() + ", Nombre: " + student.getName() + ", Edad: "
                    + student.getAge() + " - Email: " + student.getEmail() + " - Profesion: " + student.getProfession());
        }else{
            System.out.println("\nEstidiante no encontrado");
        }

        adminRepository.delete("456");
        System.out.println("\nLista de estudiantes:");
        for (Student student2 : adminRepository.readAll()) {
            System.out.println(
                    "ID: " + student2.getId() + " - Nombre: " + student2.getName() + " - Edad: " + student2.getAge()
                            + " - Email: " + student2.getEmail() + " - Profesion: " + student2.getProfession());
        }
        System.out.println("\nEstudiante actualizado");
        Student Pepe = new Student("123", "Pepe", 19, "Pepe@gmail.com", "Comedia");
        adminRepository.update(Pepe.getId(), Pepe);
        for (Student student2 : adminRepository.readAll()) {
            System.out.println(
                    "ID: " + student2.getId() + " - Nombre: " + student2.getName() + " - Edad: " + student2.getAge()
                            + " - Email: " + student2.getEmail() + " - Profesion: " + student2.getProfession());
        }

    }
}
