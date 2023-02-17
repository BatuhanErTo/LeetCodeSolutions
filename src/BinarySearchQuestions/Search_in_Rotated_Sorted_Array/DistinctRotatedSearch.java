package BinarySearchQuestions.Search_in_Rotated_Sorted_Array;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class DistinctRotatedSearch {
    public int search(int[] nums, int target) {
        int peak = findPeak(nums);
        if(peak == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(target == nums[peak]){
            return peak;
        }
        if(target >= nums[0]){
            return binarySearch(nums,target,0,peak-1);
        }
        return binarySearch(nums,target,peak+1,nums.length-1);
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

    public int binarySearch(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(nums[mid]>target){
                end = mid - 1;
            }else if(nums[mid]<target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
