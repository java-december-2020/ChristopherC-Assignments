import java.util.Arrays;
import java.util.ArrayList;
public class BasicJavaTest {
    public static void main(String[]args){
        BasicJava b = new BasicJava();

        int[] arr = {-3,-5,-7};

        int[] nums = {2,5,10,-4};

        int y = 10;

        b.PrintNum();

        b.PrintOddNum();

        b.PrintSum();

        b.LoopArray(arr);

        b.FindMax(arr);

        b.FindMin(arr);

        b.getAvg(nums);

        b.OddArray();

        b.GreaterThanY(arr, y);

        b.SquareArray(nums);

        b.EliminateNegatives(nums);

        b.MaxMinAverage(nums);

        b.ShiftArrayValues(arr);
    }
}