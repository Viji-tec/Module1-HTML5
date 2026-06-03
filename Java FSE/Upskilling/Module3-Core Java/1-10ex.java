/*public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}*/

//ex 2
/*import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Choose operation: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Result = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result = " + (num1 * num2));
                break;
            case 4:
                if(num2 != 0)
                    System.out.println("Result = " + (num1 / num2));
                else
                    System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}*/

//ex3

/*
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        sc.close();
    }
}
*/

//ex4

/*
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");

        sc.close();
    }
}*/

//ex5

/*
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
} */

//ex6

/*
public class DataTypeDemo {
    public static void main(String[] args) {

        int a = 100;
        float b = 10.5f;
        double c = 20.55;
        char d = 'A';
        boolean e = true;

        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Double: " + c);
        System.out.println("Character: " + d);
        System.out.println("Boolean: " + e);
    }
}*/

//ex7
 /*
 public class TypeCastingExample {
    public static void main(String[] args) {

        double d = 99.99;
        int i = (int)d;

        int num = 50;
        double value = num;

        System.out.println("Double Value: " + d);
        System.out.println("After Casting to Int: " + i);

        System.out.println("Int Value: " + num);
        System.out.println("After Casting to Double: " + value);
    }
} */

//ex8

/*
public class OperatorPrecedence {
    public static void main(String[] args) {

        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;

        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("(10 + 5) * 2 = " + result2);
    }
} */

//ex9
/*
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        if(marks >= 90)
            System.out.println("Grade A");
        else if(marks >= 80)
            System.out.println("Grade B");
        else if(marks >= 70)
            System.out.println("Grade C");
        else if(marks >= 60)
            System.out.println("Grade D");
        else
            System.out.println("Grade F");

        sc.close();
    }
} */

//10


/*import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        int guess;

        do {
            System.out.print("Enter your guess (1-100): ");
            guess = sc.nextInt();

            if(guess > secretNumber)
                System.out.println("Too High!");
            else if(guess < secretNumber)
                System.out.println("Too Low!");
            else
                System.out.println("Congratulations! Correct Guess!");

        } while(guess != secretNumber);

        sc.close();
    }
} */