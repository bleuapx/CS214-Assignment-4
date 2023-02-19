import java.util.Scanner;
import java.util.Random;

public class UsernameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Promt for user's first and last name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
         
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Generate username
        String username = firstName.substring(0, 1) + lastName.substring(0, 5) + random.nextInt(99) + 10;

        // Print the generated username
        System.out.println("Your username is: " + username);
     }
}