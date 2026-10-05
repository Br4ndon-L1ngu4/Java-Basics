// because 'Packages' is in the 'tools' package, we must import it as follows:
import tools.Packages; // You can rename this to 'tools.*' to import ALL files inside the 'tools' package.

class marker extends Packages {
    public void func() {
        System.out.println(marks);
    }
}

public class Main {
    public static void main(String[] args) {
        marker print = new marker();
        print.func();
    }
}