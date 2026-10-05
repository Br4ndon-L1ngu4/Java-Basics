
public class MultiDimensionalArray {

    public static void main(String[] args) {
        // Creating a 2D array (multidimensional array)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int random = (int) (Math.random() * 100); // Generate a random integer between 0 and 99

        // Displaying the elements of the 2D array
        System.out.println("2D Array elements:");
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        // Accessing an element at a specific position
        int elementAtRow1Col2 = matrix[1][2]; // Accessing the element at row 1, column 2 (which is 6)
        System.out.println("Element at row 1(second row), column 2(third column): " + elementAtRow1Col2);

        // Modifying an element in the 2D array
        matrix[0][1] = random; // Changing the element at row 0, column 1 to a random number
        System.out.println("Modified 2D Array elements after changing element at row 0, column 1 to a random number (" + random + "):");
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        System.out.println("Modified 2D Array elements after changing all elements:");
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = random; // Changing all elements to the same random number
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
