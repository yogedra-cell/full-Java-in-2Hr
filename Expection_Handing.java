import java.util.Scanner;

public class Expection_Handing {
    public static void main(String[] args) {

        // TRY block in Exception Handling 
        int[] marks = {98, 82, 83};

        try {
            System.out.println(marks[5]); // This will cause ArrayIndexOutOfBoundsException
        } catch (Exception exception) {
            System.out.println("Error: You are trying to access an invalid index.");
            System.out.println("Exception Message: " + exception);
        } finally {
            System.out.println("This block always executes.");
        }

        System.out.println("The Student is Kamal");

    }
}
