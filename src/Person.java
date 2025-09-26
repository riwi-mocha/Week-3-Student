public class Person {
    protected String name;
    protected int age;

    // Constructor de Person, luego lo vamos a utilizar para crear Student
    public Person (String name, int age){
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if (age <= 0 || age > 100) {
            throw new IllegalArgumentException("La edad debe estar entre 1 y 100 años");
        }

        this.name = name.trim();
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.name = name.trim();
    }

    public void setAge(int age){
        if (age <= 0 || age > 100) {
            throw new IllegalArgumentException("La edad debe estar entre 1 y 100 años");
        }
        this.age = age;
    }

    @Override
    public String toString(){
        return "Person{name='" + name + "', age=" + age + "}";
    }
}