
public class StringBuffing {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb.toString());

        sb.insert(5, ",");
        sb.setLength(5);
        sb.ensureCapacity(20);

        System.out.println(sb.toString());
    }
}
