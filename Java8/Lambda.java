package Java8;

@FunctionalInterface
interface MyFunctionalInterface {
    void doSomething();
}

public class Lambda {
    public static void main(String[] args) {
        // Define a lambda expression to implement the MyFunctionalInterface
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Hello World!");

        // Call the doSomething() method on the lambda expression
        myFunctionalInterface.doSomething();
    }
}