
class Fruits {

    String name;
    String color;
    String nutritionalValue;
}

public class Array_of_Objects {

    public static void main(String[] args) {
        // Creating an array of Fruits objects
        Fruits[] fruitArray = new Fruits[3];

        // Initializing the Fruits objects
        fruitArray[0] = new Fruits();
        fruitArray[0].name = "Apple";
        fruitArray[0].color = "Red";
        fruitArray[0].nutritionalValue = "Rich in fiber and vitamin C";

        fruitArray[1] = new Fruits();
        fruitArray[1].name = "Banana";
        fruitArray[1].color = "Yellow";
        fruitArray[1].nutritionalValue = "High in potassium and vitamin B6";

        fruitArray[2] = new Fruits();
        fruitArray[2].name = "Orange";
        fruitArray[2].color = "Orange";
        fruitArray[2].nutritionalValue = "Excellent source of vitamin C";

        // Displaying the details of each fruit
        for (Fruits fruit : fruitArray) { // Looping for however many fruits are in the array, which is 3 in this case
            System.out.println("Fruit Name: " + fruit.name);
            System.out.println("Color: " + fruit.color);
            System.out.println("Nutritional Value: " + fruit.nutritionalValue);
            System.out.println(); // Print a blank line for better readability
        }
    }
}
