import java.util.Arrays;
import java.util.ArrayList;
public class BasicJava { 
    // Print 1-255
   public void PrintNum() {
        for(int i = 1; i <= 255; i++) 
        System.out.println(i);
        }
    // Print 1-255 Odd
    public void PrintOddNum(){
        for(int i = 1; i <= 255; i++) {
            if(i % 2 == 1)
            System.out.println(i);
        }
    }
    // Print Sum
    public void PrintSum(){
        int sum = 0;
        for(int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println("New number: "+ i + " " + "Sum: " + sum);
        }
    }

    // Iterating through an array
   public void LoopArray(int[] arr){
        for(int val:arr)
            System.out.println(val);
    }

    // Max value in array
    public static int FindMax(int[] arr) {
		int currMax = Integer.MIN_VALUE;
		for(int val: arr){
			if(val > currMax)
                currMax = val;
                System.out.println(val);
        }
		return currMax;
    }
    
    // Min value in array
    public static int FindMin(int[] arr) {
		int currMin = Integer.MAX_VALUE;
		for(int val: arr){
			if(val < currMin)
				currMin = val;
		}
		return currMin;
    }
    
    // Get average
    public static int GetArraySum(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
    public static double getAvg(int[]nums) {
        int sum = GetArraySum(nums);
        double avg = (double)sum/nums.length;
        System.out.println("Sum: " + sum + " " + "Average:" + avg);
        return avg;
    } 

    // Array with odds
    public ArrayList<Integer> OddArray() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i <= 255; i++) {
			if(i % 2 != 0)
                nums.add(i);
                System.out.println(nums);
		}
		return nums;
} 
    // Greater than Y 
    public int GreaterThanY(int[] arr, int y) {
		int count = 0;
		for(int num: arr) {
			if(num > y)
				count++;
		}
		return count;
    } 
    
    // Square the values
    public void SquareArray(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
            System.out.println(nums);
		}
    }
    

    // Eliminate negatives
    public static void EliminateNegatives(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < 0)
                nums[i] = 0;
            System.out.println(nums);
		}
    }

    // Max, Min and Avg
    public static void MaxMinAverage(int[] nums) {
		int min = FindMin(nums);
		int max = FindMax(nums);
		double avg = getAvg(nums);
		System.out.println(String.format("Max: %d, Min: %d, Average: %f", max, min, avg));
    }
    


    // Shifting values in array
    public static void ShiftArrayValues(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			arr[i-1] = arr[i];
		}
        arr[arr.length-1] = 0;
        System.out.println(arr);
	}
}

