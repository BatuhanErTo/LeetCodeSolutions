package SearchingQuestions.Binary_Search;
// https://leetcode.com/problems/binary-search/
class Solution {
    public int search(int[] nums, int target) {
        int highIndex = nums.length-1;
        int lowestIndex = 0;
        while(lowestIndex<=highIndex){
            int midIndex = lowestIndex + (highIndex-lowestIndex)/2;
            if(target<nums[midIndex]){
                highIndex=midIndex-1;
            }else if(target>nums[midIndex]){
                lowestIndex = midIndex+1;
            }else{
                return midIndex;
            }
        }
        return -1;
    }
}