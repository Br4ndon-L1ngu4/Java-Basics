public class IfElse
{
    public static void main(String[] args) {

        String first_name = "John";
        String last_name = "Doe";
        int johnAge = 27;

        if (first_name == "John" && last_name == "Doe" && johnAge >= 21) {
            System.out.println("Welcome in, "+first_name);
        } else if (johnAge >= 21) {
            System.out.println("Sorry, but you are not on the list.");
        } else {
            System.out.println("Sorry, but you are not old enough.");
        }
    }
}