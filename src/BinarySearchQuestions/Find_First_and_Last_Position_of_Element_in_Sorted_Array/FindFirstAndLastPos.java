package BinarySearchQuestions.Find_First_and_Last_Position_of_Element_in_Sorted_Array;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FindFirstAndLastPos {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int firstIndex = search(nums,target,true);
        int lastIndex = search(nums,target,false);
        ans[0] = firstIndex;
        ans[1] = lastIndex;
        return ans;
    }

    public int search(int[] nums, int target, boolean side){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid]<target){
                start = mid + 1;
            }else if(nums[mid]>target) {
                end = mid - 1;
            }else{
                ans = mid;
                if(side){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
