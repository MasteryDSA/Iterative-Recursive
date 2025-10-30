//Recursi method for finding the sum of all array elements
public class SumOfArrayElementsUsingRecursive {
    static int sumRecursive(int sum, int index){
        int[] nums = {2, 4, 6, 8, 10, 12, 18, 20, 24, 26};
        if(index == nums.length)
            return 0;
        else
            return nums[index] + sumRecursive(sum, index + 1);
    }
    public static void main(String[] args){
        int sum = 0;
        int index = 0;
        System.out.println("Sum: "+ sumRecursive(sum, index));
    }
}
