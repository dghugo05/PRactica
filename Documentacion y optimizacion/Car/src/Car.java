/**
 * Class that refers to an object of type "Car".
 * This class contains methods to manage the information of a car.
 */
public class Car {
    /**
     * Attribute that stores the brand of the car.
     */
    private String make;

    /**
     * Attribute that stores the model of the car.
     */
    private String model;

    /**
     * Attribute that stores the year the car was manufactured.
     */
    private int year;

    /**
     * Attribute that stores the price of the car.
     */
    private double price;

    /**
     * "Car" class constructor.
     * 
     * @param make The brand of the car.
     * @param model The model of the car.
     * @param year The year the car was manufactured.
     * @param price The price of the car.
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Method that returns the brand of the car.
     * 
     * @return make The brand of the car.
     */
    public String getMake() {
        return make;
    }

    /**
     * Method that establish a new brand for the car.
     * 
     * @param make The new brand of the car.
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Method that returns the model of the car.
     * 
     * @return model The model of the car.
     */
    public String getModel() {
        return model;
    }

    /**
     * Method that establish a new model for the car.
     * 
     * @param model The new model of the car.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Method that returns the year the car was manufactured.
     * 
     * @return year The year the car was manufactured.
     */
    public int getYear() {
        return year;
    }

    /**
     * Method that establish a new year for the car.
     * 
     * @param year The new year the car was manufactured.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Method that returns the price of the car.
     * 
     * @return price The price of the car.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Method that establish a new price for the car.
     * 
     * @param price The new price of the car.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Method that returns a description of the car.
     * 
     * @return A description of the car.
     */
    public String carDescription() {
        return "The car is a " + year + " " + make + " " + model + " priced at $" + price;
    }

    /**
     * Method that returns a string representation of the object Car.
     * 
     * @return A string representation of the object Car.
     */
    @Override
    public String toString() {
        return carDescription();
    }

    /**
     * Main method that creates an object of the class Car and prints its description in the console.
     * 
     * @param args Terminal lines arguments.
     */
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2025, 26800);
        System.out.println(car);
    }
}