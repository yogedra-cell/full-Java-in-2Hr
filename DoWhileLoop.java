import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int N = sc.nextInt();

        int i = 1;

        do {
            System.out.println("Your Number is: " + i)
            ;
            i = i + 1;
        } while(i <= N);
    System.out.println("The End");}
}
