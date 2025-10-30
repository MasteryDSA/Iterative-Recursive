//Finding the nth term of nth number in a fibonacci sequence using recursive method.
public class FibonacciNumberUsingRecursive {
    static int nthTermRecursive(int nthNumber) {
        if(nthNumber==1)
            return 0;
        if(nthNumber==2)
            return 1;
        else
            return nthTermRecursive(nthNumber-1)+nthTermRecursive(nthNumber-2);

    }
    public static void main(String[] args){
        int nthNumber = 4;
        if(nthNumber < 1)
            throw new IllegalArgumentException("nthNumber must be >= 1");
        else
            System.out.println("F(" + nthNumber + ") = " + nthTermRecursive(nthNumber));
    }
}
