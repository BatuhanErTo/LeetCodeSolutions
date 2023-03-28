package Count_Primes;

import java.util.Arrays;

// https://leetcode.com/problems/count-primes/
class Solution {
    public int countPrimes(int n) {
        boolean[] flags = new boolean[n];
        Arrays.fill(flags, true);
        int counter = 0;
        for(int i = 2; i < n; i++){
            if(flags[i]){
                counter++;
                for(int j = 2*i; j < n; j += i){
                    flags[j] = false;
                }
            }
        }
        return counter;
    }
}