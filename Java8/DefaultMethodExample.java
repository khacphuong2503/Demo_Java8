package Java8;

// Define a Vehicle interface with two abstract methods: start() and stop(), and a default method: honk()
interface Vehicle {
    void start();
    void stop();

    default void honk() {
        System.out.println("Beep beep!");
    }
}

// Define a Car class that implements the Vehicle interface
class Car implements Vehicle {
    // Implement the start() method
    public void start() {
        System.out.println("Starting the car");
    }

    // Implement the stop() method
    public void stop() {
        System.out.println("Stopping the car");
    }
}

// Create a main class to test the Car class
class DefaultMethodExample {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car();

        // Call the start(), honk(), and stop() methods of the Car object
        car.start();
        car.honk();
        car.stop();
    }
}
