package SearchingQuestions.Find_the_Rotation_Count_in_Rotated_Sorted_array;
//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class FindRotationCount {
    public static void main(String[] args) {
        int rotation = findPeak(new int[]{15, 18, 2, 3, 6, 12});
        System.out.println(rotation+1);
    }
    static int findPeak(int[] nums){
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
