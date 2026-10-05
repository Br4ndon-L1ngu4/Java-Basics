package tools; // 'tools' must be a package if it's inside a folder labled as the package itself.
// It's like you're putting this class inside a package labled 'tools'.

class Launch {
    public void func() {
        Packages pack = new Packages();
        System.out.println(pack.marks);
    }
}
public class Packages {
    protected int marks = 10; // this must be protected because it is inside a package.
    // Think of it like bubble-wrap protecting a fragile item inside the package!

    public void showMarks(int marks) {
        this.marks = marks;
    }
}