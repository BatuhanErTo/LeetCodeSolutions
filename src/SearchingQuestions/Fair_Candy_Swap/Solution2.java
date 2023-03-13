package SearchingQuestions.Fair_Candy_Swap;

import java.util.HashSet;

class Solution2 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumOfAlice = 0;
        int sumOfBob = 0;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i = 0; i < aliceSizes.length; i++){
            sumOfAlice += aliceSizes[i];
            hashSet.add(aliceSizes[i]);
        }

        for(int i = 0; i < bobSizes.length; i++){
            sumOfBob += bobSizes[i];
        }

        int difference = (sumOfAlice - sumOfBob) / 2;

        for(int i = 0; i < bobSizes.length; i++){
            if(hashSet.contains(bobSizes[i] + difference)){
                return new int[]{bobSizes[i]+difference, bobSizes[i]};
            }
        }
        return null;
    }
}