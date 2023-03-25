import Student.Student;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String s = "hello";
        System.out.println(s.compareTo("HELLO"));

        Student myStudent = new Student();
        myStudent.display();
        Student.display();


    }
}