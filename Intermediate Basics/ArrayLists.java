
import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        // Creating an ArrayList to store integers
        List<Integer> numbers = new ArrayList<>();
        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        // Displaying the elements of the ArrayList
        System.out.println("ArrayList elements: " + numbers);
        // Accessing an element at a specific index
        int elementAtIndex2 = numbers.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);
        // Removing an element from the ArrayList
        numbers.remove(1); // Removes the element at index 1 (20)
        System.out.println("ArrayList after removing element at index 1: " + numbers);
        // Checking if the ArrayList contains a specific value
        boolean contains30 = numbers.contains(30);
        System.out.println("Does the ArrayList contain 30? " + contains30);
        // Getting the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of the ArrayList: " + size);
        // Clearing all elements from the ArrayList
        numbers.clear();
        System.out.println("ArrayList after clearing all elements: " + numbers);

        // Here's an example of a multidimensional ArrayList (a list of lists):
        List<List<Integer>> multiList = new ArrayList<>();
        // Adding lists to the multidimensional ArrayList
        List<Integer> innerList1 = new ArrayList<>();
        innerList1.add(1);
        innerList1.add(2);
        List<Integer> innerList2 = new ArrayList<>();
        innerList2.add(3);
        innerList2.add(4);
        multiList.add(innerList1);
        multiList.add(innerList2);

        // The printing of this should look similar to a bracketed set of x and y coordinates, like this: [[1, 2], [3, 4]]
        System.out.println("Multidimensional ArrayList: " + multiList);
    }
}

class AlternateExample {

    // Lists can also be stored this way:
    int[] numbers = {1, 2, 3, 4, 5};
    int[] numbers2 = new int[5]; // This creates an array of size 5, but all elements are initialized to 0.

    System.out.println (
            

    "First element of numbers array: " + numbers[0]); // Accessing the first element of the array
    System.out.println (
            

"Length of numbers array: " + numbers.length); // Getting the length of the array
}
