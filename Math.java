public class Math {
    public static void main(String[] args) {
        
        // Declare two integer variables 'a' and 'b'
        int a = 10, b = 20;
        
        // Math.max(a, b) returns the larger value between 'a' and 'b'
        // In this case, 20 is greater than 10
        System.out.println(Math.max(a, b)); // Output: 20
        
        // Math.min(x, y) returns the smaller value
        System.out.println(Math.min(5, 6)); // Output: 5
        
        // Math.random() returns a random decimal number between 0.0 and 1.0
        System.out.println(Math.random()); 

        System.out.println((int)Math.random()*100);
    }
}
