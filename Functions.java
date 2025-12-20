import java.util.Scanner;

public class Functions {

    // A simple method
    public static void PowerOf() {
        System.out.println("PowerOf");
    }

    // Method with a String parameter
    public static void Name(String userName) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = sc.nextLine();
        System.out.println("Your Name is: " + name);
    }

    public static void main(String[] args) {
        // Methods
        PowerOf();
        PowerOf();
        PowerOf();

        // Calling method with parameter
        Name("Kamal"); 
    }
}
