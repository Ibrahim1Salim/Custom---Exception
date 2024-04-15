import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int age = getAgeFromInput();
            if (age < 0) {
                throw new InvalidAgeException("Age cannot be negative");
            }
            System.out.println("Age entered: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age: " + e.getMessage());
        }

    }

    private static int getAgeFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();
        return age;
    }
}