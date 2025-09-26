public class Student extends Person {
    private String studentID;
    private String lenguage;

    public Student(String studentID, String name, int age, String lenguage){
        super(name, age); // Llama al constructor de Person (que ya tiene validaciones)

        // Validaciones  de Student
        if (studentID == null || studentID.trim().isEmpty()) {
            throw new IllegalArgumentException("El studentID no puede estar vacío");
        }
        if (lenguage == null || lenguage.trim().isEmpty()) {
            throw new IllegalArgumentException("El lenguage no puede estar vacío");
        }

        this.studentID = studentID.trim();
        this.lenguage = lenguage.trim();
    }

    public String getStudentID(){
        return studentID;
    }
    public String getlenguage(){
        return lenguage;
    }

    public void setStudentID(String studentID){
        if (studentID == null || studentID.trim().isEmpty()) {
            throw new IllegalArgumentException("El studentID no puede estar vacío");
        }
        this.studentID = studentID.trim();
    }

    public void setLenguage(String lenguage){
        if (lenguage == null || lenguage.trim().isEmpty()) {
            throw new IllegalArgumentException("El lenguage no puede estar vacío");
        }
        this.lenguage = lenguage.trim();
    }

    @Override
    public String toString(){
        return "Student{studentID='" + studentID + "', name='" + name + "', age=" + age + ", lenguage='" + lenguage + "'}";
    }
}
