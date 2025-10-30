//Recursive method for finding the sum of all array elements
public class SumOfArrayElementsUsingIterative {
    static int sumIterative(){
        int[] nums = {2, 4, 6, 8, 10, 12, 18, 20, 24, 26};
        int sum = 0;
        for(int i=0; i<=nums.length-1; i++){
            sum +=nums[i];
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println("Sum: "+ sumIterative());
    }
}
