
class Person {

    private String fName;
    private String lName;
    private String occupation;
    private int age;

    public Person() { // Here is a regular constructor
        fName = "John";
        lName = "Doe";
        occupation = "Accountant";
        age = 28;
    }

    public Person(String fName, String lName, String occupation, int age) { // Here is a constructor with parameters
        this.fName = fName;
        this.lName = lName;
        this.occupation = occupation;
        this.age = age;
    }

    public String getFirstName() {
        return fName;
    }

    public void setFirstName(String fName) {
        this.fName = fName;
    }

    public String getLastName() {
        return lName;
    }

    public void setLastName(String lName) {
        this.lName = lName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("ERROR: Cannot be " + age + " years old.");
        } else {
            this.age = age;
        }
    }
}

public class Constructors {

    public static void main(String[] args) {
        Person person = new Person();

        // You can literally just set the values of whatever you want inside the function. Simple.
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setOccupation("Accountant");
        person.setAge(28);

        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Occupation: " + person.getOccupation());
        System.out.println("Age: " + person.getAge());
    }
}
