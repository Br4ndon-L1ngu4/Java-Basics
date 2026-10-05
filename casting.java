public class casting
{
    public static void main(String[] args) {
        int n0 = 128728;
        byte n1 = (byte) n0; // Because this is a 'double' byte type, it doubles the maximum value.

        float f = 9.9f;
        int t = (int) f; // Because this is a 'double' integer, this value will be rounded down.

        System.out.println(n1);
        System.out.println(t);


        // Example of type promotion:
        byte N0 = 20;
        byte N1 = 120; // both Byte-types are in their respective ranges.
        int result = N1 * N0; /* But because this is now an integer type when multiplied, then the value
                               * will be an integer-type as well instead of a byte-type error..
                               */
    }
}