/**
 * The Vehicle class is an abstract class that represents a generic vehicle.
 * It contains fields for the vehicle's ID, brand, and year of manufacture.
 * It also has a constructor to initialize these fields, getters and setters for each field, and an abstract method for starting the engine.
 */
import java.time.Year;
import utility.Util;

public abstract class Vehicle {

    // Fields
    private String id;
    private String brand;
    private int year;

    /**
     * Constructor to initialize the Vehicle's brand and year fields.
     * It sets the ID field using a utility method from the Util class.
     * @param brand The brand of the vehicle.
     * @param year The year of manufacture of the vehicle.
     */
    public Vehicle(String brand, int year) {
        this.id = Util.getRandomString();
        this.brand = brand;
        setYear(year);
    }

    // Getters and setters for each field
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    /**
     * Sets the year of manufacture for the vehicle.
     * It checks if the year is a valid year and throws an exception if it is not.
     * @param year The year of manufacture of the vehicle.
     */
    public void setYear(int year) {
        int currentYear = Year.now().getValue();
        if (year > currentYear) {
            throw new IllegalArgumentException("Invalid year. Year cannot be in the future.");
        } else if (0 > year) {
            throw new IllegalArgumentException("Invalid year. Vehicle wasn't invented before Jesus.");
        }
        this.year = year;
    }

    /**
     * Abstract method for starting the engine of the vehicle.
     * This method must be implemented by any class that extends the Vehicle class.
     */
    public abstract void startEngine();
}