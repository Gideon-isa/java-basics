package Student;

public class Student {
    private int id;
    private static int age;


    public Student(){}

    public void act() {
        age = 8;
    }

    public static void display() {
        System.out.println("Nothing");
        age = 8;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.id = 7;
        s2.id = 9;

        System.out.println(s1.id);
        try {
            int ans = Integer.parseInt("78");
        }catch(NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        Integer b = 7;
        System.out.println();

    }
}
