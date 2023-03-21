package SearchingQuestions.Special_Array_With_X_Elements_Greater_Than_or_Equal_X;
//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/
class Solution {
    public int specialArray(int[] nums) {
        int length = nums.length;
        for(int i = 1; i <= length; i++){
            int counter = 0;
            for(int j = 0; j < length; j++){
                if(nums[j] >= i){
                    counter++;
                }
            }
            if(counter == i){
                return i;
            }
        }
        return -1;
    }
}
