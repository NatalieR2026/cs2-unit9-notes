import java.util.ArrayList;
public class Main {

   public static void main(String []args) {
      // Use the default/no-arg constructors
      Vehicle v1 = new Vehicle();
      Car c1 = new Car();
      // Use the parameterized constructors
      // ORDER of arguments must match formal params!
      Vehicle v2 = new Vehicle(3, 10.0, "Black");
      Car c2 = new Car(4, 80.0, "Pickle", 5, "Audi");
      
      // Test toString methods
      System.out.println(v1);
      System.out.println(v2);
      System.out.println(c1);
      System.out.println(c2);

      // Test behavior methods
      v2.makeNoise();
      c2.makeNoise(); // OVERRIDE parent method
      
      // POLYMORPHISM example:
      // all classes in a hierarchy can be treated as
      // instances of the TOP (most super) type
      Vehicle v3 = new Vehicle();
      Vehicle c3 = new Car(); // Car IS-A type of Vehicle
      // Car bad = new Vehicle(); DOES NOT WORK.
      Vehicle scoot = new Scooter();
      Vehicle moto = new Motorcycle();
      Vehicle convertible = new Convertible();

      // POLYMORPHISM example:
      // Can store any subclass in a superclass-type collection
      ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
      vehicleList.add(v1);
      vehicleList.add(v2);
      vehicleList.add(v3);
      vehicleList.add(c1); // object constructed as a Car
      vehicleList.add(c2); // but Cars are still Vehicles!
      vehicleList.add(c3);
      vehicleList.add(moto);
      vehicleList.add(scoot);
      System.out.println(vehicleList);


   }
}
