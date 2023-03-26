package newspaper;

public class Staff extends User{
    @Override
    public void printUserType() {
        System.out.println("Staff");
    }

    public void postAReview() {
        System.out.println("Staff: postAReview");
    }

    public static void showStatic() {
        System.out.println("Staff: in staff static method");
    }
}
