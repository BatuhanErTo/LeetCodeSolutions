package SearchingQuestions.Two_Sum_II_Input_Array_Is_Sorted;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int sum = numbers[left]+numbers[right];
        while(sum!=target){
            if(sum<target){
                left++;
            }else{
                right--;
            }
            sum = numbers[left]+numbers[right];
        }
        return new int[]{left+1,right+1};
    }
}