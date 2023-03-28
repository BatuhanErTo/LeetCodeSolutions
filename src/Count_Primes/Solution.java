package Count_Primes;
// https://leetcode.com/problems/count-primes/
class Solution {
    public int countPrimes(int n) {
        boolean[] flags = new boolean[n];
        for(int i = 2; i < n; i++){
            flags[i] = true;
        }

        for(int i = 2; i < n; i++){
            if(flags[i]){
                for(int j = 2*i; j < n; j += i){
                    flags[j] = false;
                }
            }
        }

        int counter = 0;
        for(int i = 2; i < n; i++){
            if(flags[i])
                counter++;
        }
        return counter;
    }
}