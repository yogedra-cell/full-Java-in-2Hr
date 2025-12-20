import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        
        //While loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int N = sc.nextInt();

        int i = N;
        while (i>=0) {
            System.out.println("Your Number:" +i);
            i = i-1;
            
        }

    }
    
}
