/**
 * The Car class is a subclass of Vehicle that represents a car with a brand, year, and number of seats.
 */
public class Car extends Vehicle{

    private int numberOfSeats; // The number of seats in the car.

    /**
     * Constructs a Car object with a brand, year, and the default number of seats (5).
     * @param brand The brand of the car.
     * @param year The year the car was made.
     */
    public Car(String brand, int year){
        this(brand, year, 5);
    }

    /**
     * Constructs a Car object with a brand, year, and number of seats.
     * @param brand The brand of the car.
     * @param year The year the car was made.
     * @param numberOfSeats The number of seats in the car.
     */
    public Car(String brand, int year, int numberOfSeats){
        super(brand, year);
        setNumberOfSeats(numberOfSeats);
    }

    /**
     * Gets the number of seats in the car.
     * @return The number of seats in the car.
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * Sets the number of seats in the car.
     * @param numberOfSeats The number of seats in the car.
     * @throws IllegalArgumentException if the number of seats is less than 1.
     */
    public void setNumberOfSeats(int numberOfSeats) {
        if (numberOfSeats < 1) {
            throw new IllegalArgumentException("Invalid number of seats. Number of seats cannot be less than 1.");
        }
        this.numberOfSeats = numberOfSeats;
    }

    /**
     * Overrides the startEngine method in the superclass to print "Car engine starts...".
     */
    @Override
    public void startEngine() {
        System.out.println(getBrand() + " car engine starts...");
    }
} 