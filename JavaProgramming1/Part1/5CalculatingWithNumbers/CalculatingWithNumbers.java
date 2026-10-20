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

        System.out.println("here is an integer --> " + 2);
        System.out.println(2 + " <-- here is an integer");

        int first2 = 3;
        int second2 = 2;
        double result = first2 / second2;
        System.out.println(result);

        double whenDividendIsFloat = 3.0 / 2;
        System.out.println(whenDividendIsFloat); // prints 1.5
        double whenDivisorIsFloat = 3 / 2.0;
        System.out.println(whenDivisorIsFloat); // prints 1.5

        int first1 = 3;
        int second1 = 2;
        double result1 = (double) first1 / second1;
        System.out.println(result1); // prints 1.5
        double result2 = first1 / (double) second1;
        System.out.println(result2); // prints 1.5
        double result3 = (double) (first1 / second1);
        System.out.println(result3); // prints 1.0

        int dividend = 3;
        int divisor = 2;
        double result4 = 1.0 * dividend / divisor;
        System.out.println(result4);
    }
}