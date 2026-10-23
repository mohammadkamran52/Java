
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.err.println("How old are you?");
        int input = Integer.valueOf(scan.nextLine());
        if(input<18){
            System.out.println("You are not an adult");
        } else{
            System.err.println("You are an adult");
        }
    }
}
