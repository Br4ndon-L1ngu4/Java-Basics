abstract class Person { // 'abstract' in this case allows abstract functions to be made
    public abstract void speakName(); // Like a grocery list for things to get later.
    public abstract void informAge(); // in this case, the 'abstract' means that we'll define the functions later.
    public abstract void perform();

    // This entire class here stands as the grocery list.
    // All abstract functions must go here, as this is the parent class.
}
abstract class Child extends Person {
    // Finally defining those functions - or getting these items as are on the grocery list of functions.
    public void speakName() {System.out.println("My name is John Doe.");}
    public void informAge() {System.out.println("I am 39 years old.");}
}
class UpdateChild extends Child {
    public void perform() {System.out.println("I can fly!");}
}

public class Main {
    public static void main(String[] args) {
        // we must use the UpdateChild() class because it extends what is extending the parent class.
        // You cannot use the parent class all on its own because the functions in there are not defined yet.
        Person object = new UpdateChild();
        object.speakName();
        object.informAge();
        object.perform();
    }
}