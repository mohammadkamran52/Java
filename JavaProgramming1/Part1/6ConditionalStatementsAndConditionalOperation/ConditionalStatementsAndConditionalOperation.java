import java.util.Scanner;

public class ConditionalStatementsAndConditionalOperation{
    public static void main(String[] args){
        System.out.println("Hello, world!");
        if (true) {
            System.out.println("This code is unavoidable!");
        }

        int number = 11;
        if (number > 10) {
            System.out.println("The number was greater than 10");
        }

        int number1 = 4;
        if (number1 > 5) {
            System.out.println("Your number is greater than five!");
        } else {
            System.out.println("Your number is five or less!");
        }

        int number2 = 3;
        if (number2 == 1) {
            System.out.println("The number is one");
        } else if (number2 == 2) {
            System.out.println("The given number is two");
        } else if (number2 == 3) {
            System.out.println("The number must be three!");
        } else {
            System.out.println("Something else!");
        }

        int number3 = 5;
        if (number3 == 0) {
            System.out.println("The number is zero.");
        } else if (number3 > 0) {
            System.out.println("The number is greater than zero.");
        } else if (number3 > 2) {
            System.out.println("The number is greater than two.");
        } else {
            System.out.println("The number is less than zero.");
        }

        boolean isItTrue = true;
        if (isItTrue) {
            System.out.println("Pretty wild!");
        }

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first string");
        String first = reader.nextLine();
        System.out.println("Enter the second string");
        String second = reader.nextLine();
        if (first == second) {
            System.out.println("The strings were the same!");
        } else {
            System.out.println("The strings were different!");
        }

        System.out.println("Enter a string");
        String input = reader.nextLine();
        if (input.equals("a string")) {
            System.out.println("Great! You read the instructions correctly.");
        } else {
            System.out.println("Missed the mark!");
        }

        System.out.println("Input two strings");
        String first1 = reader.nextLine();
        String second1 = reader.nextLine();
        if (first1.equals(second1)) {
            System.out.println("The strings were the same!");
        } else {
            System.out.println("The strings were different!");
        }
        if (first1.equals("two strings")) {
            System.out.println("Clever!");
        }
        if (second1.equals("two strings")) {
            System.out.println("Sneaky!");
        }
    }
}