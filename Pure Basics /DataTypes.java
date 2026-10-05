public class DataTypes {

    public static void main(String[] a) {
        // Our First Variables --->
        int FirstNumber = 6; // This is an integer-type variable. Notice the "int".
        int SecondNumber = 12;
        int Result = FirstNumber + SecondNumber;

        double cost = 2.8; // This is a double-type variable. It lengthens the amount of characters you can have.
        double mortgage = 28.93;

        byte by = 127; // This is a byte-type variable. It can only go from -128 to 127.
        short sh = 583; // This is a short-type variable. Only a set amount of digits can be present.
        long g = 828183l; // This is a long-type variable. End with 'l' to lengthen the amount of digits.
        float price = 77.85f; // This is a float-type variable. End the number with 'f' to define decimals.

        boolean alive = false; // This is a boolean-type variable. It can either be true or false.
        char c = 'c'; // This is a character-type variable. It represents a singular character.

        System.out.print(Result);
    }
}
