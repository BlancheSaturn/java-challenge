import java.util.Scanner;



    public class Calculator
    {
        public static void main(String[] args)
        {
            double price = 8.0; // Price per square foot
            double length; // To input room length
            double width; // To input room width
            Floor dimensions; // To hold room dimensions
            Carpet room; // To determine cost
// Create a Scanner object for keyboard input.
            Scanner scanner = new Scanner(System.in);


// Get the length of the room.
            System.out.print("Enter the length first: ");
            length = scanner.nextDouble();

// Get the width of the room.
            System.out.print("Now enter the width: ");
            width = scanner.nextDouble();

// Create Floor and Carpet objects.
            dimensions = new Floor(length, width);
            room = new Carpet(price);
           double area = dimensions.getArea();
// Display the dimensions and cost.
            System.out.println(room.getCost()* area);
        }
    }


