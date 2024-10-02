

    abstract class Vehicle {
        // Abstract method (no implementation here)
        abstract void start();

        // Concrete method with implementation
        void stop() {
            System.out.println("Vehicle is stopped");
        }
    }

    class Lory extends Vehicle {
        // Providing implementation for the abstract method
        void start() {
            System.out.println("Car is starting");
        }
    }

    public class AbstractionEx2 {
        public static void main(String[] args) {
            Vehicle myLorry = new Vehicle() {
                @Override
                void start() {

                }
            };
            myLorry.start();  // Outputs: Car is starting
            myLorry.stop();   // Outputs: Vehicle is stopped
        }
    }