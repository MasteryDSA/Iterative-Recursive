//Recursive method for finding the factorial of a positive integer.
public class FactorialOfaNumberUsingRecursive {
    public static int recursiveFactorial(int num){
        if(num==0|| num==1)
            return 1;
        else
            return num*recursiveFactorial(num-1);
    }
    public static void main(String[] args){
        int num = 5;
        System.out.println("Factorial of " +num+ " is "+ recursiveFactorial(num));
    }
}
