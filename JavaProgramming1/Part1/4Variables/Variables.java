import java.util.Scanner;

public class Variables{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String text = "contains text";
        int wholeNumber = 123;
        double floatingPoint = 3.141592653;
        boolean trueOrFalse = true;
        
        System.out.println("Text variable: " + text);
        System.out.println("Integer variable: " + wholeNumber);
        System.out.println("Floating-point variable: " + floatingPoint);
        System.out.println("Boolean: " + trueOrFalse);


        int value = 10;
        System.out.println(value);
        value = 4;
        System.out.println(value);


        double pi = 3.14;
        double radius = 22.0;
        double surfaceArea = pi * radius * radius;
        System.out.println(surfaceArea);

        /* These are not allowed as a variable.
        last day of month = 20;
        1day = 1952;
        beware! = 1910;
        1920 = 1;
        */

       int camelCase = 2;
       //int camelCase = 5; // Not allowed -- camelCase variable is already in use!


       String valueAsString = "42";
       int value2 = Integer.valueOf(valueAsString);
       System.out.println(value);

       System.out.println("Write a value ");
       int value3 = Integer.valueOf(scanner.nextLine());
       System.out.println("You wrote " + value3);
    }
}