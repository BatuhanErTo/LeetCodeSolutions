package BinarySearchQuestions.Split_Array_Largest_Sum;
//https://leetcode.com/problems/split-array-largest-sum/
public class Solution {
    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{1,2,3,4,5},2));
    }
    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for(int i = 0; i < nums.length; i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }

        while(start < end){
            int mid = start + (end - start)/2;

            int count = 1;
            int sum = 0;

            for(int num : nums){
                if(sum + num > mid){
                    sum = num;
                    count++;
                }else{
                    sum += num;
                }
            }

            if(count <= k){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return end;
    }
}
