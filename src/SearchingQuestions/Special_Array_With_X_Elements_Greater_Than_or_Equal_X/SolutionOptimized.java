package SearchingQuestions.Special_Array_With_X_Elements_Greater_Than_or_Equal_X;

import java.util.Arrays;

public class SolutionOptimized {
    public static void main(String[] args) {
        int[] nums = {3,5};
        System.out.println(specialArray(nums));
    }
    static int specialArray(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int counter = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i]>=mid)
                    counter++;
            }
            if(counter > mid)
                left = mid + 1;
            else if(counter < mid)
                right = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
