

interface FirstInterface {
    public void firstMethod();
}


interface SecondInterface {
    public void secondMethod();
}





public class MultipleInterfaces implements FirstInterface , SecondInterface  {

    @Override
    public void firstMethod() {
        System.out.println("This is the method in first interface");
    }


    public void secondMethod(){
        System.out.println("This is the method in second interface");
    }




    public static void main(String[] args) {
        MultipleInterfaces act1 = new MultipleInterfaces();
        act1.firstMethod();
        act1.secondMethod();

    }
}
