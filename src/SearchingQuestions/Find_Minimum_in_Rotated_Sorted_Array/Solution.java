package SearchingQuestions.Find_Minimum_in_Rotated_Sorted_Array;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
class Solution {
    public int findMin(int[] nums) {
        int peak = findPeak(nums);
        if(peak == -1){
            return nums[0];
        }
        return nums[peak+1];
    }
    public int findPeak(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid]<nums[mid-1]){
                return mid - 1;
            }
            if(nums[mid]<nums[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

}