import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        String username = sc.nextLine();
        System.out.println("Enter Email");
        String email = sc.nextLine();

        System.out.println("New User Registered with username = " + username + " and email = " + email);

        System.out.println("Press Y if you want to continue, any other key to exit");
        boolean continueInput = sc.nextBoolean();

    }
}
