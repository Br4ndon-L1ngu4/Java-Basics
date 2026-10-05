class First extends Object {
    public First() {
        // super() calls the parent class constructor.
        // Since First extends Object, this is effectively calling Object().
        // Java usually adds this automatically if you don't write it.
        super();
        System.out.println("First Class");
    }

    public First(int i) {
        // This calls the no-argument constructor in the parent class.
        // It is the same as writing: super();
        super();
        System.out.println("1");
    }
}

class Second extends First {
    public Second() {
        // When a Second object is created, Java first initializes the parent First.
        // That means First() runs before the code in Second().
        super();
        System.out.println("Second Class");
    }

    public Second(int i) {
        // super(i) calls the matching constructor in the parent class.
        // Here, that means First(int i)
        super(i);
        System.out.println("2");
    }
}

class Third extends Second {
    public Third() {
        // This constructor chain goes: Third() -> Second() -> First() -> Object()
        super();
        System.out.println("Third Class");
    }

    public Third(int i) {
        // This chain goes: Third(int) -> Second(int) -> First(int) -> Object()
        super(i);
        System.out.println("3");
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        // A call to a constructor does NOT just run that class alone.
        // It starts in the parent class first, then works its way back down.
        First f = new First(5);
        Second s = new Second(5);
        Third t = new Third(5);

        /*
            What happens here:
            - new First(5) -> calls First(int) -> super() -> prints "1"
            - new Second(5) -> calls Second(int) -> super(i) -> First(int) prints "1" -> then Second prints "2"
            - new Third(5) -> calls Third(int) -> super(i) -> Second(int) -> First(int) prints "1" -> then "2" -> then "3"

            So the output order is:
            [1], [1,2], [1,2,3]

            The keyword super means "call the parent class version of this constructor or method".
            It's how Java connects child classes to their parent class.
        */
    }
}