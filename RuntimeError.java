import java.util.Scanner;

public class InputConversionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        try {
            String input = scanner.nextLine();
            int age = Integer.parseInt(input); // Might cause NumberFormatException
            System.out.println("You entered age: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
