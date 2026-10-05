
public class JavaLoop {

    public static void main(String[] args) {

        int num = 0;

        // This will run until the incrementing number reaches 999:
        while (num <= 9999) {
            System.out.println(num);
            num++;
        } // These are typically used to read files with an unknown amount of characters.
        // The same thing is going on here:
        // To simplify this down, the code says:
        // "Do all of this while these parameters are in place."

        int num2 = 1; // You MUST reset the value of num to 1, 
        // otherwise it will not print anything because num is already 10000.
        do {
            System.out.println(num2);
            num2++;
        } while (num2 <= 9999);
        System.out.println("10000!!");

        // Here is a basic for-loop:
        // You can also use these for reading files, but only if you know their value.
        for (int i = num; i <= 1000; i++) {
            System.out.println(i);
        }
        // You will notice that it always begins at zero, and then continues until it reaches 1000.
        // This is not a mistake. 0 is basically the initial start of a program when it counts or updates.
        // NOTE: It will start at zero if the initial value is 0. If the initial value is 1, it will start at 1.
    }
}
