class State extends Object {
    public void show() {
        System.out.println("Hello, World!");
    }

    public void configure() {
        System.out.println("Hello, Configuration!");
    }
}

class Method extends State {
    // Because show() is already in a class, we must override that restriction to use the function
    @Override
    public void show() {
        System.out.println("Hello, State!");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        State state = new State();
        Method method = new Method();
        state.show();
        method.show();
        state.configure();
    }
}