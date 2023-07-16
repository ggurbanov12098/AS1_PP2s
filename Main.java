/**
 * This code constructs a hierarchy of vehicles to illustrate inheritance and polymorphism concepts.
 * Car and Motorcycle are subclasses that inherit from the basic class, Vehicle, which is itself.
 * Method overriding enables polymorphism and allows varied startEngine() method functionality.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Car c1 = new Car("Toyota", 2022, 4);
            Car c2 = new Car("Honda", 2023);
            Motorcycle m1 = new Motorcycle("Harley-Davidson", 2021, true);
            Motorcycle m2 = new Motorcycle("Yamaha", 2023);

            Vehicle[] vehicles = {c1, c2, m1, m2};
            race(vehicles);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
/**
 * By turning on the engines of the vehicles in the array, the method imitates a race. 
 * An array of Vehicle objects called by parameter Vehicles represents the competing vehicles in the race.
 */
    public static void race(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println();
            vehicle.startEngine();
            System.out.println("ID: " + vehicle.getId());
            System.out.println("Brand: " + vehicle.getBrand());
            System.out.println("Year: " + vehicle.getYear());
            if(vehicle instanceof Car) System.out.println("Number of seats: " + ((Car) vehicle).getNumberOfSeats());
            else if(vehicle instanceof Motorcycle) System.out.println("Has side car: " + ((Motorcycle) vehicle).getHasSideCar());
            else System.out.println("That's something new which has engine in it :D");
            System.out.println();
        }
    }
}
