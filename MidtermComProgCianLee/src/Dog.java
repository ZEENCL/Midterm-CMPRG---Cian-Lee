// Cian Stephen M. Lee - Midterm Output
class Dog
{
	// Declaration of variables
    private String name;
    private String breed;
    
	public static void main(String[] args)
    {
        // Array of Dog objects
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog("Buddy", "Golden Retriever");
        dogs[1] = new Dog("Rocky", "Bulldog");

        // New values to update the dog objects
        String[] newNames = {"Max", "Charlie"};
        String[] newBreeds = {"Labrador", "Beagle"};

        // Update attributes of each dog
        for (int i = 0; i < dogs.length; i++)
        {
            dogs[i].setName(newNames[i]);
            dogs[i].setBreed(newBreeds[i]);
        }

        // Print the updated dog details
        System.out.println("-------= DOGS =-------\n");
        for (Dog dog : dogs)
        {
            dog.displayInfo();
            System.out.println("\n----------------------\n");
        }
    }

    // Constructor
    public Dog(String name, String breed)
    {
        this.name = name;
        this.breed = breed;
    }

    // Setter methods
    public void setName(String name)
    {
        this.name = name;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    // Getter methods
    public String getName()
    {
        return name;
    }

    public String getBreed()
    {
        return breed;
    }
    
    // Display dogs function
    public void displayInfo()
    {
    	System.out.println("Dog Details:\n" + "Name: " + name + "\nBreed: " + breed);
    }
}
