package myinterface;

public class Bus implements Vehicle{

    String model;
    int yearOfMake;

    public Bus() {
        this.model = "Toyota";
        this.yearOfMake = 2023;
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

    @Override
    public String toString() {
        return "Bus{" +
                "model='" + model + '\'' +
                ", yearOfMake=" + yearOfMake +
                '}';
    }
}
