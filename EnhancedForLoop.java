
class Person {

    String FirstName;
    String LastName;
    String Email;
    String PhoneNumber;
    String Address;
    String City;
    String State;
    String ZipCode;
    String Country;
    String DateOfBirth;
    String DateOfDeath;
    String Gender;
    String MaritalStatus;
    int Age;
}

public class EnhancedForLoop {

    public static void main(String[] args) {
        // Creating an array of Person objects
        Person[] people = new Person[3];

        // Initializing the Person objects
        people[0] = new Person();
        people[0].FirstName = "John";
        people[0].LastName = "Doe";
        people[0].Email = "john.doe@gmail.com";
        people[0].PhoneNumber = "123-456-7890";
        people[0].Address = "123 Main St";
        people[0].City = "Anytown";
        people[0].State = "CA";
        people[0].ZipCode = "12345";
        people[0].Country = "USA";
        people[0].DateOfBirth = "01/01/1990";
        people[0].DateOfDeath = "05/17/2077";
        people[0].Gender = "Male";
        people[0].MaritalStatus = "Married";
        people[0].Age = 33;

        people[1] = new Person();
        people[1].FirstName = "Jane";
        people[1].LastName = "Doe";
        people[1].Email = "jane.doe@gmail.com";
        people[1].PhoneNumber = "123-456-7891";
        people[1].Address = "123 Main St";
        people[1].City = "Anytown";
        people[1].State = "CA";
        people[1].ZipCode = "12345";
        people[1].Country = "USA";
        people[1].DateOfBirth = "01/15/1988";
        people[1].DateOfDeath = "05/17/2081";
        people[1].Gender = "Female";
        people[1].MaritalStatus = "Married";
        people[1].Age = 35;

        people[2] = new Person();
        people[2].FirstName = "Aiden";
        people[2].LastName = "Doe";
        people[2].Email = "aiden.doe@gmail.com";
        people[2].PhoneNumber = "123-456-7892";
        people[2].Address = "123 Main St";
        people[2].City = "Anytown";
        people[2].State = "CA";
        people[2].ZipCode = "12345";
        people[2].Country = "USA";
        people[2].DateOfBirth = "05/07/2010";
        people[2].DateOfDeath = "05/17/2110";
        people[2].Gender = "Male";
        people[2].MaritalStatus = "Single";
        people[2].Age = 21;

        // Displaying the details of each person using an enhanced for loop
        for (Person person : people) {
            System.out.println("First Name: " + person.FirstName);
            System.out.println("Last Name: " + person.LastName);
            System.out.println("Email: " + person.Email);
            System.out.println("Phone Number: " + person.PhoneNumber);
            System.out.println("Address: " + person.Address);
            System.out.println("City: " + person.City);
            System.out.println("State: " + person.State);
            System.out.println("Zip Code: " + person.ZipCode);
            System.out.println("Country: " + person.Country);
            System.out.println("Date of Birth: " + person.DateOfBirth);
            System.out.println("Date of Death: " + person.DateOfDeath);
            System.out.println("Gender: " + person.Gender);
            System.out.println("Marital Status: " + person.MaritalStatus);
            System.out.println("Age: " + person.Age);
            System.out.println(); // Print a blank line for better readability
        }
    }
}
