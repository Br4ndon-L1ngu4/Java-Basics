@FunctionalInterface interface Person {String getName(String f_name, String l_name);}
// A functional interface can only have ONE function

public class Main {
    public static void main(String[] args) {
        // A functional interface can be created like this:
        Person obj = (f_name, l_name) -> f_name + " " + l_name;
        // Object    Parameters        Whatever the function is doing

        String full_name = obj.getName("John","Doe");
        System.out.println(full_name);
    }
}