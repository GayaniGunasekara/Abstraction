// Abstract class Animal


    abstract class Animal {
        // Abstract method (no implementation here)
        abstract void makeSound();

        // Regular method (concrete method)
        public void eat() {
            System.out.println("This animal is eating");
        }
    }

    // Subclass Dog extends the abstract class Animal
    class Dog {
        // Implementing the abstract method
        public void makeSound() {
            System.out.println("Dog barks");
        }
    }

    // Subclass Cat extends the abstract class Animal
    class Cat {
        // Implementing the abstract method
        public void makeSound() {
            System.out.println("Cat meows");
        }
    }

    public class AbstractClassEx {
        public static void main(String[] args) {
        }






}
