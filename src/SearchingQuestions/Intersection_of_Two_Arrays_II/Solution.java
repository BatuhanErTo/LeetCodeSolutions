package SearchingQuestions.Intersection_of_Two_Arrays_II;

import java.util.Arrays;

// https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int length1 = nums1.length;
        int length2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] answer = new int[length1 + length2];
        while(i < length1 && j < length2){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                answer[k++] = nums1[i++]; // to save space comlexity you can use given array (nums1,nums2) to store the answer instead of answer[] array
                j++;
            }
        }
        return Arrays.copyOf(answer,k);
    }

}
