package classobject;

public class Student {
    private String name;
    private int age;
    private int height;
    private int roll;
    private int studentClass;
    private char section;

    public Student(String name, int age, int height, int roll, int studentClass, char section) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.roll = roll;
        this.studentClass = studentClass;
        this.section = section;
    }

   public void display() {
       System.out.println("Name: " + name + ", Age: " + age + ", Height: " + height + ", Roll: " + roll + ", Class: " + studentClass + ", Section: " + section);
   }
}
