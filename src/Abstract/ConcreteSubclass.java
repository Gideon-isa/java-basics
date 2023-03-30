package Abstract;

public class ConcreteSubclass extends AbstractSubclass{

    public ConcreteSubclass() {}
    @Override
    void test2() {
        System.out.println("test2");
    }

    @Override
    void test3() {
        System.out.println("test3");
    }

    // NOTE
    //test1() method has already been overridden by become a concrete method in AbstractSubclass Class

    @Override
    public String toString() {
        return this.title;
    }

    public static void main(String[] args) {
        ConcreteSubclass con = new ConcreteSubclass();
        ConcreteSubclass con2 = new ConcreteSubclass();
        con.test1(); // implementation of this is from the AbstractSubclass Class; an abstract class
        con.test2();
        con.test3();

        con.title = "strange One";
        con2.title = "strange two";

        System.out.println(con);
        System.out.println(con2);

        //Anonymous Class nrr ...
        AbstractSubclass nrr = new AbstractSubclass() {
            @Override
            void test2() {

            }

            @Override
            void test3() {

            }
        };

    }
}
