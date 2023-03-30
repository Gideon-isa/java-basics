package myinterface;

public interface Vehicle {

    // Variables are by default, public, static and final because they (interface) are pure contracts
    public static int age = 7;
    int age2 = 20; // implicitly it is = public static final int age2 = 20
    int theSort();

    // by default, abstract method on interface is public abstract but for brevity, the two are not included
    // because they are included by default
    public abstract int guess();

    //OR just only with the return type as the public and abstract key word is already included by the compiler
    String display();

    // It can also have concrete methods
    default String drive(){
        return "Drive";
    }

    // All members are public by default
    // Members can not be private or protected
}
