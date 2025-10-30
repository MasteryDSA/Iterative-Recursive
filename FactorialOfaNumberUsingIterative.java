//Iterative method for finding the factorial of a positive integer.
public class FactorialOfaNumberUsingIterative {
    public static int iterativeFactorial(int num){
        int result = 1;
        for (int i = num; i >= 1; i--){
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args){
        int num = 5;
        System.out.println("Factorial of " +num+ " is "+ iterativeFactorial(num));
    }
}
