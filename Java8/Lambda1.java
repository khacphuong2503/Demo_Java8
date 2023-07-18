package Java8;

@FunctionalInterface
interface MyFunctionalInterface1 {
    void doSomething(String message);
}

public class Lambda1 {
    public static void main(String[] args) {
        // Define a lambda expression to implement the MyFunctionalInterface
        MyFunctionalInterface1 myFunctionalInterface1 = (message) -> System.out.println(message);

        // Call the doSomething() method on the lambda expression
        myFunctionalInterface1.doSomething("Hello World!");
    }
}
