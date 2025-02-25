// Cian Stephen M. Lee - Midterm Output
class Rectangle
{
	// Declaration of variables
    private double width;
    private double height;
    
	public static void main(String[] args)
    {
        // Array of Rectangle objects
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(5, 10);
        rectangles[1] = new Rectangle(3.5, 7.2);
        rectangles[2] = new Rectangle(6, 8);

        // Display area and perimeter for each rectangle
        System.out.println("----= RECTANGLES =----\n");
        for (Rectangle rect : rectangles)
        {
            rect.displayInfo();
            System.out.println("\n----------------------\n");
        }
    }

    // Constructor
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    // Calculate area
    public double getArea()
    {
        return width * height;
    }

    // Method to calculate perimeter
    public double getPerimeter()
    {
        return 2 * (width + height);
    }
    
    public void displayInfo()
    {
    	System.out.println("Rectangle: " + width + " x " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
