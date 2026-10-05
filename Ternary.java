public class Ternary
{
    public static void main(String[] args) {
        String t = "true";
        String f = "false";
        int a = 10;
        String result = t;

        result = a * 2 == 20 ? t : f;
        System.out.println(result);
        // We have an equation here, and the question mark represents an ascii if-statement:
        /* If the result is equal to twenty, the value is true.
        *  If the result is not equal to twenty, the value is false.
        *  The t/f statements are separated by a colon
        */
    }
}