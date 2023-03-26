package newspaper;

public class User {
    public void printUserType() {
        System.out.println("User");
    }

    public void saveWebLink() {
        System.out.println("User: saveWebLink");
        postAReview();
    }

    public void postAReview() {
        System.out.println("User: postAReview");
    }

    public static void showStatic() {
        System.out.println("User: in user static method");
    }
}
