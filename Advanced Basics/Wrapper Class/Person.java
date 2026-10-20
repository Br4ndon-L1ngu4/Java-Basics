class Console {
    public void log(String msg) {System.out.println(msg);}
    public void line(String msg) {System.out.print(msg);}
}
public class Person {
    Console console = new Console();

    private String age;
    private String yearBorn;
    private String yearDead;

    public void setAge(String age) {this.age = age;}
    public void setBirth(String birth) {this.yearBorn = birth;}
    public void setDeath(String death) {this.yearDead = death;}

    public void printInfo() {
        // Must be formatted this way because Integer.parseInt(age) acts as a number at that point.
        console.log("Age: " + (Integer.parseInt(age) + 10));
        console.log("Birth Year: " + (Integer.parseInt(yearBorn) + 10));
        console.log("Death Year: " + (Integer.parseInt(yearDead) + 10));
    }
}