import java.util.Scanner;

public class Logical {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your C Marks:");
        int CMarks = sc.nextInt();

        System.out.println("Enter Your Microprocessor Marks:");
        int MicroprocessorMarks = sc.nextInt();

        System.out.println("Enter Your Math Marks:");
        int mathMarks = sc.nextInt();

        System.out.println("Enter Your English Marks:");
        int EnglishMarks = sc.nextInt();

        System.out.println("Enter Your Account Marks:");
        int AccountMarks = sc.nextInt();

        int total = CMarks + MicroprocessorMarks + mathMarks + EnglishMarks + AccountMarks;
        double percentage = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage);

        // Check Fail first
        if(CMarks < 35 || MicroprocessorMarks < 35 || mathMarks < 35 || EnglishMarks < 35 || AccountMarks < 35) {
            System.out.println("Result: Fail");
            System.out.println("Grade: N/A");
        } 
        else {
            System.out.println("Result: Pass");

            if(percentage >= 90)
                System.out.println("Grade: A+");
            else if(percentage >= 80)
                System.out.println("Grade: A");
            else if(percentage >= 70)
                System.out.println("Grade: B+");
            else if(percentage >= 60)
                System.out.println("Grade: B");
            else if(percentage >= 50)
                System.out.println("Grade: C+");
            else if(percentage >= 40)
                System.out.println("Grade: C");
            else if(percentage >= 35)
                System.out.println("Grade: D");
           
        }
    }
}
