//Counting the digits of a given number using recursive method.
public class CountDigitsOfNumberRecursive {
    public static int countDigitsRecursive(String stringNums){
        if(stringNums.isEmpty()||stringNums.equals("0"))
            return 0;
        else
            return 1 + countDigitsRecursive(stringNums.substring(1));

    }
    public static void main(String[] args){
        int nums = 340284;
        String stringNums = "";
        stringNums+=nums;
        System.out.println("Number: " +nums+ "\nNumber of Digits: " +countDigitsRecursive(stringNums));
    }
}
