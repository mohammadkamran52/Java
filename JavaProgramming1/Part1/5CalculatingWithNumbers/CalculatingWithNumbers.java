public class CalculatingWithNumbers{
    public static void main(String[] args){
        int first = 2;
        System.out.println(first); // prints 2
        int second = 4;
        System.out.println(second); // prints 4
        
        int sum = first + second; // The sum of the values of the variables first and second is assigned to the variable sum
        System.out.println(sum); // prints 6

        int calculationWithParentheses = (1 + 1) + 3 * (2 + 5);
        System.out.println(calculationWithParentheses); // prints 23
        int calculationWithoutParentheses = 1 + 1 + 3 * 2 + 5;
        System.out.println(calculationWithoutParentheses); // prints 13
        
        System.out.println(first + second); // prints 6
        System.out.println(2 + second - first - second); // prints 0
    }
}