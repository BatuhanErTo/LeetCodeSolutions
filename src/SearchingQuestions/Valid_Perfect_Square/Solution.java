package SearchingQuestions.Valid_Perfect_Square;
//https://leetcode.com/problems/valid-perfect-square/description/
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        long start = 1;
        long end = num/2;
        while(start <= end){
            long mid = start + (end - start) / 2;
            if((mid*mid) > num){
                end = mid - 1;
            }else if((mid*mid) < num){
                start = mid + 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
