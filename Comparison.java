import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        
        // Number Change day
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int day = sc.nextInt();

        if(day == 1)
            System.out.println("Sunday");
        if(day == 2)
            System.out.println("Munday");
        if(day == 3)
            System.out.println("Tusesday");
        if(day == 4)
            System.out.println("Wedneday");
        if(day == 5)
            System.out.println("Thursday");
        if(day == 6)
            System.out.println("Friday");
        if(day == 7)
            System.out.println("Saturday");
            else
            System.out.println("Invalid Number");




    }
    
}
