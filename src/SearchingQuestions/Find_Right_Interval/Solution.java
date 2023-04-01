package SearchingQuestions.Find_Right_Interval;

import java.util.Arrays;
//https://leetcode.com/problems/find-right-interval/description/
class Solution {
    public int[] findRightInterval(int[][] intervals) {
        // create a new array which also contains third element
        // in order to control result indicies
        int length = intervals.length;
        int[][] intervalsIndex = new int[length][3];

        for(int i = 0; i < length; i++){
            intervalsIndex[i] = new int[]{intervals[i][0],intervals[i][1],i};
        }

        Arrays.sort(intervalsIndex,(a, b) -> a[0] - b[0]);
        int[] result = new int[length];

        for(int i = 0; i < length; i++){
            int resultIndex = binarySearch(i,length,intervalsIndex[i][1],intervalsIndex);
            result[intervalsIndex[i][2]] = resultIndex;
        }
        return result;
    }
    private int binarySearch(int start, int end, int target, int[][] arr){
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid][0] < target){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        if(start >= arr.length)
            return -1;
        return arr[start][2];
    }
}
