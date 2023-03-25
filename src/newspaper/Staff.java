package newspaper;

public class Staff extends User{
    @Override
    public void printUserType() {
        System.out.println("Staff");
    }

    public void postAReview() {
        System.out.println("Staff: postAReview");
    }
}
