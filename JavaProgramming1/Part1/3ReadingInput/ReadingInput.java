import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message1 = "Hello world!";
        System.out.println(message1);

        System.out.println("Hello " + "world!");

        String message2 = "Hello world!";
        System.out.println(message2 + " ... and the universe!");

        String start = "My name is.. ";
        String end = "..Mohammad Kamran!";
        System.out.println(start + "Kamran, " + end);

        System.out.println("Write a message: ");
        String message3 = scanner.nextLine();
        System.out.println(message3);
        System.out.println(message3);
        System.out.println("You wrote: "+message3);


        System.out.println("Write the first string:");
        String first = scanner.nextLine();
        System.out.println("Write the second string:");
        String second = scanner.nextLine();
        System.out.println("Write the third string:");
        String third = scanner.nextLine();

        System.out.println("You wrote:");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}