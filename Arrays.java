import java.util.Arrays;

public class Arrays {
    public static void main(String[] args) {

        int[] marks = new int[3];
        marks[0] = 99;
        marks[1] = 98;
        marks[2] = 79;

        // Print first element
        System.out.println(marks[0]);

        // Length
        System.out.println(marks.length);

        // Sort array
        Arrays.sort(marks);
        System.out.println(marks[0]);
    }
}