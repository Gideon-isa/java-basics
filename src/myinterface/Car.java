package myinterface;

public class Car implements Vehicle, Cloneable{

    String model;
    int yearOfMake;
    public Car() {
        this.model = "BMW";
        this.yearOfMake = 2022;
    }

    @Override
    public int theSort() {
        return 0;
    }

    @Override
    public int guess() {
        return 0;
    }

    @Override
    public String display() {
        return null;
    }

    void testInterface(Vehicle e) {
        System.out.println(e);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfMake=" + yearOfMake +
                '}';
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        var a = myCar.drive();
        System.out.println(a);
        System.out.println("===================");

        Vehicle myBus = new Bus();

        // An interface can only be a Reference type
        Vehicle myCar2 = new Car();


        int newAge = Vehicle.age; // Only accessible by the Class (interface name)

        System.out.println(myCar);
        System.out.println(myCar2);
        System.out.println(myBus);


    }

    @Override
    public Car clone() {
        try {
            Car clone = (Car) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
