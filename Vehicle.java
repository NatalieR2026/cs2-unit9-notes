/* Vehicle is a SUPERCLASS (PARENT)
Put the most GENERAL attributes +
behaviors in this class definition
Java classes can have MULTIPLE CHILDREN, but ONLY ONE PARENT
 */
public class Vehicle {
    // 1. INSTANCE VARIABLES
    private int numWheels;
    private double avgSpeed;
    private String color;

    // 2. CONSTRUCTORS
    // Methods to INITIALIZE all variables
    public Vehicle() {
        this.numWheels = 4;
        this.avgSpeed = 60;
        this.color = "Black";
    }
    // Constructor with formal parameters
    public Vehicle(int numWheels, double avgSpeed, String color) {
        // INITIALIZE to passed arguments
        this.numWheels = numWheels;
        this.avgSpeed = avgSpeed;
        this.color = color;
    }

    // 3. METHODS

    // toString method will get called when you pass an object in a print statement
    public String toString() {
        return ("Vehicle [numWheels: " + this.numWheels + ", avgSpeed: " 
        + this.avgSpeed + ", color: " + this.color + "]");
    }

    // ACCESSOR (GETTER) METHODS
    public int getNumWheels() {
        return this.numWheels;
    }
    public double getAvgSpeed() {
        return this.avgSpeed;
    }
    public String getColor() {
        return this.color;
    }

    // Behvaior methods (can be OVERRIDDEN in child classes)
    public void makeNoise() {
        System.out.println("Vroom vroom...🏎️💨");
    }

}