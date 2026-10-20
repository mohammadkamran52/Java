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
    }
}