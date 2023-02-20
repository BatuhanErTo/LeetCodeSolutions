package BinarySearchQuestions.Search_in_Rotated_Sorted_Array;

public class DuplicatedRotatedSearch {
    public int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if(nums[start]==nums[mid] && nums[end] == nums[mid]){
                if(nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                if(nums[end]<nums[end-1]){
                    return end-1;
                }
                end--;
            }else if(nums[mid]>nums[start] || (nums[start] == nums[mid] && nums[start] > nums[end])){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
