package SearchingQuestions.Fair_Candy_Swap;

import java.util.Arrays;

// https://leetcode.com/problems/fair-candy-swap/description/
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        int sumOfAlice = 0;
        int sumOfBob = 0;
        for(int i = 0; i < aliceSizes.length; i++){
            sumOfAlice += aliceSizes[i];
        }
        for(int j = 0; j < bobSizes.length; j++){
            sumOfBob += bobSizes[j];
        }

        int indexOfAlice = 0;
        int indexOfBob = 0;

        while(indexOfAlice < aliceSizes.length && indexOfBob < bobSizes.length){
            int newSumOfAlice = sumOfAlice - aliceSizes[indexOfAlice] + bobSizes[indexOfBob];
            int newSumOfBob = sumOfBob - bobSizes[indexOfBob] + aliceSizes[indexOfAlice];
            if(newSumOfAlice == newSumOfBob){
                break;
            }else if(newSumOfAlice > newSumOfBob){
                indexOfAlice++;
            }else{
                indexOfBob++;
            }
        }
        return new int[]{aliceSizes[indexOfAlice],bobSizes[indexOfBob]};
    }
}