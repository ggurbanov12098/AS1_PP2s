/**
 * The Motorcycle class extends the Vehicle class and represents a specific type of vehicle.
 * It has a boolean attribute to indicate whether it has a sidecar or not.
 */
public class Motorcycle extends Vehicle{

    private boolean hasSideCar;

    /**
     * Constructs a new Motorcycle object with the given brand and year. By default, it does not have a sidecar.
     *
     * @param brand the brand of the motorcycle
     * @param year the year of the motorcycle
     */
    public Motorcycle(String brand, int year) {
        super(brand, year);
        this.hasSideCar = false;
    }

    /**
     * Constructs a new Motorcycle object with the given brand, year, and sidecar status.
     *
     * @param brand the brand of the motorcycle
     * @param year the year of the motorcycle
     * @param hasSideCar whether the motorcycle has a sidecar or not
     */
    public Motorcycle(String brand, int year, boolean hasSideCar) {
        super(brand, year);
        setHasSideCar(hasSideCar);
    }

    /**
     * Starts the engine of the motorcycle and prints a message indicating the brand of the motorcycle.
     */
    @Override
    public void startEngine() {
        System.out.println(getBrand() + " motorcycle engine starts...");
    }

    /**
     * Gets the sidecar status of the motorcycle.
     *
     * @return true if the motorcycle has a sidecar, false otherwise
     */
    public boolean getHasSideCar() {
        return hasSideCar;
    }

    /**
     * Sets the sidecar status of the motorcycle.
     *
     * @param hasSideCar whether the motorcycle has a sidecar or not
     */
    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }
}