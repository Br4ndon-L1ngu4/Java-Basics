public class Main {
    public static void main(String[] args) {
        // Example of auto-boxing
        int number = 20;
        Integer numInteger = number; // number is stored inside this object

        // Example of auto-unboxing
        int number_2 = numInteger;

        // If a string contains a number, you can parse the value in an Integer object.
        String str = "17";
        int number_3 = Integer.parseInt(str); // Makes the string a number!

        System.out.println(numInteger);
        System.out.println(number_2 -= 10);
        System.out.println(number_3 *= 2);

        // Example of all of this below:
        Person object = new Person();
        object.setAge("17");
        object.setBirth("2009");
        object.setDeath("2088");
        object.printInfo();
    }
}