// The 'interface' is essentially just an abstract class, but with one keyword this time!
interface Lines {
    // Every function in the interface class is already public and abstract!
    // Every variable, if declared, will be final and static in this interface.
    void greet(String greeting); // No need for those two other keywords. *scoff*
    void stateName(String name);
    void stateGender(String gender);
    void stateAge(Integer age);
}
interface Attributes { // If you wanted, you can extend the contents of the Lines interface since these two are both interfaces.
    void setCharisma(Integer charisma);
    void setLooks(char looksRank);
    void setAgility(Integer agility);
    void setSmarts(Integer intelligence);
}
// In the class below, it must 'implement' the interface instead of extend it.
// The great thing about interfaces is that you can implement as many as you want into a class!
class Person implements Lines, Attributes {
    public Integer charisma;
    public Integer agility;
    public Integer intelligence;
    public char looksRank;
    // Every single function in the interface class must be included in this class. Otherwise it won't work and instead give you an error
    @Override // All functions must be overridden to ensure no yellow lines on your screen, which we can all agree is pretty annoying.
        public void greet(String greeting) {System.out.println(greeting);}
    @Override public void stateName(String name) {System.out.println("My name is " + name + ".");}
    @Override public void stateGender(String gender) {System.out.println("I am a " + gender + ", and have been for as long as I've been alive.");}
    @Override public void stateAge(Integer age) {System.out.println("I am " + age + " years old.");}

    @Override public void setCharisma(Integer charisma) {this.charisma = charisma;}
    @Override public void setAgility(Integer agility) {this.agility = agility;}
    @Override public void setSmarts(Integer intelligence) {this.intelligence = intelligence;}
    @Override public void setLooks(char looksRank) {this.looksRank = looksRank;}
    
    public void printAtts() {
        System.out.println("\nCharisma: " + charisma);
        System.out.println("Agility: " + agility);
        System.out.println("IQ Score: " + intelligence);
        System.out.println("Looks: " + looksRank);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person(); // Here, the class can be declared naturally.

        person.greet("Hello, World!");
        person.stateName("John Doe");
        person.stateGender("Male");
        person.stateAge(28);

        person.setCharisma(20);
        person.setAgility(12);
        person.setSmarts(131);
        person.setLooks('S');
        person.printAtts();
    }
}