/* Car is a SUBCLASS (CHILD)
that INHERITS from Vehicle
"Car IS-A type of Vehicle"
 */
public class Car extends Vehicle {
    // Attributes that are SPECIFIC
    // to a Car, but not all Vehicles
    private int numSeats;
    private String brand;

    // Constructors are NOT inherited!
    public Car() {
        super(); // CALL to the superclass
        this.numSeats = 5;
        this.brand = "Audi";
    }

    public Car(int numWheels, double avgSpeed, String color, int numSeats, String brand) {
        // Must call super() FIRST
        // before setting up the other variables
        super(numWheels, avgSpeed, color);
        this.numSeats = numSeats;
        this.brand = brand;
    }
    // toString method will get called when you pass an object in a print statement
    // Example of OVERRIDING a parent class method
    public String toString() {
        return ("Car [numWheels: " + this.getNumWheels() 
        + ", avgSpeed: " + this.getAvgSpeed() 
        + ", color: " + this.getColor() 
        + ", numSeats: " + this.numSeats 
        + ", brand: " + this.brand 
        + "]");
    }

    // OVERRIDE parent class method
    public void makeNoise() {
        // use super.method() to call the parent's method FIRST
        super.makeNoise();
        // then add on to that behavior
        System.out.println("Beep beep");
    }

}