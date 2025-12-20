public class ThreeDArrey {
    public static void main(String[] args) {

        int[][][] data = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };

        // Access element
        System.out.println(data[1][0][1]); // 6

        // Print all elements
        for (int i = 0; i < data.length; i++) {
            System.out.println("Layer " + i);
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.print(data[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
