package BinarySearchQuestions.Kth_Missing_Positive_Number;
// Kth Missing Positive Number
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int missAmount = arr[mid] - mid - 1;
            if(missAmount < k){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        System.out.println("start : " + start);
        return k + end + 1;
    }
}