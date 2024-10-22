import java.sql.SQLOutput;

interface Animal1{
    public void makeAnimalSound();
    public void sleep();
}

class Pig implements Animal1{
    @Override
    public void makeAnimalSound() {
        System.out.println("Weee Weee");
    }

    @Override
    public void sleep() {
        System.out.println("sszzz");
    }
}


public class Activity01 {

    public static void main(String[] args) {

        Pig myPig = new Pig();
        myPig.makeAnimalSound();
        myPig.sleep();
    }




}
