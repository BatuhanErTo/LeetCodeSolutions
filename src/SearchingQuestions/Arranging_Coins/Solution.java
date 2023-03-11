package SearchingQuestions.Arranging_Coins;
//https://leetcode.com/problems/arranging-coins/description/

// To understand binary search approach, it would be really great learn gauss approach
class Solution {
    public int arrangeCoins(int n) {
        long start = 1;
        long end = n;
        while(start <= end){
            long mid = start + (end - start) / 2;
            long coins = mid*(mid+1)/2;
            if(coins == n){
                return (int)mid;
            }
            if(coins > n) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return (int)end;
    }
    /** Brute Force Solution
     class Solution {
        public int arrangeCoins(int n) {
            int count = 0;
            int sum = n;
            for(int i = 1; i <= n; i++){
                sum -= i;
                if(sum < 0){
                    break;
                }
                count++;
            }
            return count;
        }
     }
     */
}