class arithmeticOperators
{
    public static void main(String[] args) {
        int n0 = 3;
        int n1 = 18;

        int ResultAdd = n0 + n1;
        int ResultSub = n0 - n1;
        int ResultDiv = n1 / n0;
        int ResultMult = n0 * n1;

        System.out.println(ResultAdd);
        System.out.println(ResultDiv);
        System.out.println(ResultMult);
        System.out.println(ResultSub);

        n0 += n1; /* You can add or subtract with an equals sign to make this easier
                   * as opposed to n0 = n0 + n1;.
                   */
    }
}