package BinarySearchQuestions.Count_Negative_Numbers_in_a_Sorted_Matrix;
// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
/*
    -- optimized solution is below
 */
class Solution {
    public int countNegatives(int[][] grid) {
        int row = 0;
        int counter = 0;
        while(row < grid.length){
            int end = grid[0].length -1;
            int start = 0;
            while(start <= end){
                int mid =  start + (end - start)/2;

                if(grid[row][mid]>=0){
                    start = mid+1;
                }else if(grid[row][mid]<0){
                    end = mid-1;
                }
            }
            counter += grid[0].length - (end + 1);
            row++;
        }
        return counter;
    }
}
/*
-- code below is a brute force approach that Big O is O(N^2) which is not efficient

class Solution {
    public int countNegatives(int[][] grid) {
        int counter = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] < 0){
                    counter++;
                }
            }
        }
        return counter;
    }
}
*/


