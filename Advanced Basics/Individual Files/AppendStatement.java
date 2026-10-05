
public class AppendStatement {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        // Append " World" to the StringBuilder, meaning that we are adding " World" to the end of the existing string "Hello"
        sb.append(" World");
        System.out.println(sb.toString()); // the toString() method is used to convert the StringBuilder object to a String to be printed.
    }
}
