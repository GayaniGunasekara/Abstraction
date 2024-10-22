
    abstract class Car {
        abstract void sound();
         // Abstract method, no body
    }

    class Benz extends Car {
        void sound() {
            System.out.println(" Broommm Broommmm");
        }
    }

    class BMW extends Car {
        void sound() {
            System.out.println("MMMmmmmm MMmmmmmmmhh");
        }
    }

    public class AbstractionEx1 {
        public static void main(String[] args) {
            Car myBenz = new Benz();  // Creating a Dog object
            myBenz.sound();  // Outputs: Dog barks

            Car myBMW = new BMW();  // Creating a Cat object
            myBMW.sound();  // Outputs: Cat meows
        }
    }


