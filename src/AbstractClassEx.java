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
    class Dog extends Animal {
        // Implementing the abstract method
        public void makeSound() {
            System.out.println("Dog barks");
        }
    }

    // Subclass Cat extends the abstract class Animal
    class Cat extends Animal {
        // Implementing the abstract method
        public void makeSound() {
            System.out.println("Cat meows");
        }
    }

    public class AbstractClassEx {
        public static void main(String[] args) {
            Animal myDog = new Dog();  // Creating an object of subclass Dog
            myDog.makeSound();  // Outputs: Dog barks
            myDog.eat();        // Outputs: This animal is eating

            Animal myCat = new Cat();  // Creating an object of subclass Cat
            myCat.makeSound();  // Outputs: Cat meows
            myCat.eat();        // Outputs: This animal is eating
        }






}
