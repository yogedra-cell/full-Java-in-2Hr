import java.util.Scanner;

public class Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your age:");

        // Using Not 
        int age = sc.nextInt();
        if (!(age < 18)) {
            System.out.println("not adult");
             } else {
           System.out.println("adult");
}
    }
    
}
