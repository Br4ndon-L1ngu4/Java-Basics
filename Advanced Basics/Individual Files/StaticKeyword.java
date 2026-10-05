
class Person {

    String name;
    String job;
    static int age; // Since this variable is static, it can be changed collectively with one line.

    public static void Info(Person object) { // This is a function, so we need to call it in order to print anything.
        
        System.out.println("Name: " + object.name); // Since these variables are not static, they must be defined as objects instead.
        System.out.println("Occupation: " + object.job);
        System.out.println("Age: " + age); // Has no problem with age because a static variable is in a static function. It is waiting to be defined, basically.
    }

    // Below is a static block:
    static {
        age = 4;
    }
}

public class StaticKeyword {

    public static void main(String[] args) {

        Person object1 = new Person();
        object1.name = "John Doe";
        object1.job = "Accountant";
        Person.age = 5; // Because this variable is static, it must be called from its class name.

        Person object2 = new Person();
        object2.name = "Jane Doe";
        object2.job = "Nurse";
        Person.age = 29; // Like humans, static variables are not objects.

        // It does not matter if John is five. If the age is static, then the age will be whatever its latest update will be.
        // In this case, it is 29.
        object1.Info(object1);
        System.out.println();
        object2.Info(object2);
    }
}
