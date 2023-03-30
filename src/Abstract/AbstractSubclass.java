package Abstract;

public abstract class AbstractSubclass extends AbstractSuperclass{
    @Override
    void test1() {
        System.out.println("test1");
    }
    abstract void test3();

    // NOTE
    // An abstract subclass need not necessarily override all its superclass methods
    // An abstract class can contain concrete methods e.g. test1()
}
