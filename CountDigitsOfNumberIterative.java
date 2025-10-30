//Counting the digits of a given number using iterative method.
public class CountDigitsOfNumberIterative {
    public static int countDigitIterative(int nums){
        String stringNums = "";
        int digits = 0;

        stringNums+=nums;
        for(int i = 0; i<stringNums.length();i++){
            digits++;
        }
        return digits;
    }
    public static void main(String[] args){
        int nums = 390923;
        System.out.println("Number: " +nums+ "\nNumber of Digits: " +countDigitIterative(nums));
    }
}
