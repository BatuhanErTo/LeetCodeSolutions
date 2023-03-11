package SearchingQuestions.Peak_Index_in_a_Mountain_Array;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class FindPeak {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
