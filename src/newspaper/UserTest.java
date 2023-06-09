package newspaper;

public class UserTest {
    public void printUserType(User u) {
        u.printUserType();
    }

    public static void main(String[] args) {
        User user = new User();
        User staff = new Staff();
        User editor = new Editor();

        UserTest ut = new UserTest();
        ut.printUserType(user);
        ut.printUserType(staff);
        ut.printUserType(editor);

        //editor.approveReview();
        // compiler error. because it uses the reference variable editor which is of type User to access methods and not the object at compile time
        // and not the object (new Editor) itself

        editor.postAReview(); // it prints the postAReview in the Staff class because it is the immediate super class
        // i.e. JVM is searching the inherited tree starting from the Editor class then Staff class then to User...

        editor.saveWebLink();
        // It starts search from the Editor class then up the inherited tree and get to the User class
        // and prints the saveWebLink(). Which in turn calls the postAReview() then the process
        // (search for the method) start again from the Editor class and up to the Staff class where it calls
        // the PostAReview method of the Staff class

        //NOTE: FOR CLASS INSTANCES REFERENCES
        // 1. The Compiler uses the Reference type to know whether a particular method can be invoked on it
        // 2. JVM looks uses the object to know which method to invoke at run time

        // NOTE: FOR CLASS STATIC REFERENCES
        //1.
        //2. The compiler set the method to be invoked at compile time, meaning the method called is
        //3. Static methods can not be overriden
       User.showStatic();

       // NOTE
        // A class modifier can only be default or public
    }

}
