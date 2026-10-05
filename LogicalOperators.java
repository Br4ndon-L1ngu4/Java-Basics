class LogicalOperators
{
    public static void main(String[] args) {
        /* 
            ===Logical Operators===

            * && and
            * || or
            * ! not
        */
       int x = 12;
       int y = 30;
       int a = 6;
       int b = 19;

       boolean result = x < y || b < a;
       
       System.out.println(!result); // Because the ! is tied to the result, the boolean is flipped.
    }
}