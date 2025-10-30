//Finding the nth term of nth number in a fibonacci sequence using iterative method.
public class FibonacciNumberUsingIterative {
    static int nthTermIterative(int nthNumber){
        int firstTerm = 0;
        int secondTerm = 1;
        int result = 0;

        if (nthNumber==1)
            return 0;

        if (nthNumber==2)
            return 1;

        for(int i=2;i<nthNumber;i++){
            result = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = result;
        }
        return result;
    }
    public static void main(String[] args){
        int nthNumber = 8;

        System.out.println(nthTermIterative(nthNumber));
    }
}
