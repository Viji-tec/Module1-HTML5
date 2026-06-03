//ex 11

/*
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long factorial = 1;

        for(int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial = " + factorial);

        sc.close();
    }
}*/

//12

/*
public class MethodOverloading {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println("Sum of 2 Integers = " + add(10, 20));
        System.out.println("Sum of 2 Doubles = " + add(10.5, 20.5));
        System.out.println("Sum of 3 Integers = " + add(10, 20, 30));

    }
}
*/

//13

/*
import java.util.Scanner;

public class RecursiveFibonacci {

    static int fibonacci(int n) {
        if(n <= 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Number = " + fibonacci(n));

        sc.close();
    }
} */

//ex14
/*
import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int sum = 0;

        for(int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        sc.close();
    }
}
*/
//ex15
/*
import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("Reversed String = " + reversed);

        sc.close();
    }
}
*/

//ex16
/*
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(cleaned).reverse().toString();

        if(cleaned.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
} */

//ex17

/*
class Car {

    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
    }
}

public class CarDemo {
    public static void main(String[] args) {

        Car car = new Car();

        car.make = "Toyota";
        car.model = "Innova";
        car.year = 2024;

        car.displayDetails();
    }
}*/
//ex18

/*
class Animal {
    void makeSound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.makeSound();
        dog.makeSound();
    }
} */

//ex19
/*
 interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Playing Guitar");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing Piano");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Guitar g = new Guitar();
        Piano p = new Piano();

        g.play();
        p.play();
    }
}*/

//ex20
/*
import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter First Number: ");
            int a = sc.nextInt();

            System.out.print("Enter Second Number: ");
            int b = sc.nextInt();

            int result = a / b;

            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {

            System.out.println("Error: Cannot divide by zero.");

        }

        sc.close();
    }
} */