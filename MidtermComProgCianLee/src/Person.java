// Cian Stephen M. Lee - Midterm Output
class Person
{
	// Declaration of variables
    private String name;
    private int age;
    private String address; // Warning due to unused variable. Address should not be printed.
    
	public static void main(String[] args)
    {
        // Array of Person objects
        Person[] persons = new Person[5];
        persons[0] = new Person("Alice", 25, "Manila");
        persons[1] = new Person("Bob", 30, "Quezon City");
        persons[2] = new Person("Charlie", 28, "Cebu");
        persons[3] = new Person("David", 35, "Davao");
        persons[4] = new Person("Eve", 22, "Baguio");

        // Display each person's information
        System.out.println("------= PEOPLE =------\n");
        for (Person person : persons)
        {
            person.displayInfo();
            System.out.println("\n----------------------\n");
        }
    }

    // Constructor
    public Person(String name, int age, String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Display name and age function
    public void displayInfo()
    {
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}