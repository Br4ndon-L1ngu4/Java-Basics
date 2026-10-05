class Person extends Object {
    static String first_name;
    static String last_name;
    static String occupation;
    static int age;

    public static void info(Person object) {
        System.out.print("Name: " + first_name);
        System.out.println(" " + last_name);
        System.out.println("Occupation: " + occupation);
        System.out.println("Age: " + age);
    }

    public void setFirstName(String first_name) {this.first_name = first_name;}
    public void setLastName(String last_name) {this.last_name = last_name;}
    public void setOccupation(String occupation) {this.occupation = occupation;};
    public void setAge(int age) {this.age = age;}
}

public class AdvancedSelfChallenge {
    public static void main(String[] args) {
        
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setOccupation("Accountant");
        person.setAge(28);

        person.info(person); // The function 'info' is called to print stuff
    }
}