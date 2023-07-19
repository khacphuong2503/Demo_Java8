package Java8;

@FunctionalInterface
interface MyFunctionalInterface {
    int performOperation(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Use lambda expression to implement MyFunctionalInterface
        MyFunctionalInterface add = (a, b) -> a + b;
        MyFunctionalInterface subtract = (a, b) -> a - b;

        int sum = add.performOperation(10, 5);
        int difference = subtract.performOperation(10, 5);

        // In kết quả
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}