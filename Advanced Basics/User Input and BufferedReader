import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        System.out.println("Enter a value:\n");
        int val = System.in.read();
        // The read() function takes the first letter or number you enter and returns its binary value.
        // In one case, the letter A is represented by 65, which is its binary value: 01000001

        // >>System.out.println(val);<<
        // The letter Z is represented with 90, which is '01011010'

        // We can get around that by using a BufferedReader. This stores a charactor in memory so it can be read later!
        // We can pair this up with an InputStreamReader, which translates binary into text
            // InputStreamReader input = new InputStreamReader(System.in);
            // BufferedReader reader = new BufferedReader(input);

            // int num = Integer.parseInt(reader.readLine());
            // System.out.println(num);

            // reader.close(); // This is given when you're finished reading, basically!

        // Scanner can do the same thing!
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println(value);

        // Here's how to TRY that with resources:
        BufferedReader reader = null; // First, define the BufferedReader first before doing anything.
        try {
            // Second, place the InputStreamReader and re-define the BufferedReader
            reader = new BufferedReader(new InputStreamReader(System.in));

            // Third, perform the logic you want to perform
            int integer = Integer.parseInt(reader.readLine());
            System.out.println(integer / 0);
        } // Divide-by-zero error
        catch(Exception e) {System.out.println("ERROR: Cannot divide by zero!");} // Catching the error
        finally {
            System.out.println("<Console has left the Digital Ether>");
            reader.close();
        } // Finally, print any statement you choose and close the reader

        // ------ALTERNATE EXAMPLE------ //
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            System.out.println(n/0);
        } catch(ArithmeticException e) {System.out.println("ERROR: Cannot divide by zero!");}
        finally {
            System.out.println("< Console has left the Digital Ether >");
            reader.close();
        }
    }
}
