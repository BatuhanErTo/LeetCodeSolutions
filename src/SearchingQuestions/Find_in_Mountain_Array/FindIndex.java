package SearchingQuestions.Find_in_Mountain_Array;
//https://leetcode.com/problems/find-in-mountain-array/description/
public class FindIndex {
    // In the actual problem, it is given MountainArray's API interface. And has to be implemented by its interface
    // Actual solution is given below the codes in toggle comments :D
    public int search(int[] arr,int target){
        int peak = peakIndexInMountainArray(arr);
        int resIndex = orderAgnosticBs(arr,target,0,peak);
        if(resIndex!=-1){
            return resIndex;
        }
        return orderAgnosticBs(arr,target,peak+1,arr.length-1);
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    public int orderAgnosticBs(int[] array, int target, int startPoint, int endPoint){
        boolean isDesc = array[startPoint] > array[endPoint];

        while(startPoint <= endPoint){
            int midPoint = startPoint + (endPoint-startPoint)/2;

            if(array[midPoint] == target){
                return midPoint;
            }
            if(isDesc) {
                if(target<array[midPoint]){
                    startPoint = midPoint+1;
                }else{
                    endPoint = midPoint-1;
                }

            }else {
                if(target<array[midPoint]){
                    endPoint = midPoint-1;
                }else{
                    startPoint = midPoint+1;
                }
            }
        }
        return -1;
    }
}
/**
 class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
    int peak = peakIndexInMountainArray(mountainArr);
    int resIndex = orderAgnosticBs(mountainArr,target,0,peak);
    if(resIndex!=-1){
        return resIndex;
    }
    return orderAgnosticBs(mountainArr,target,peak+1,mountainArr.length()-1);
    }
 public int peakIndexInMountainArray(MountainArray mountainArr) {
    int start = 0;
    int end = mountainArr.length()-1;
    while(start<end){
        int mid = start + (end-start)/2;
        if(mountainArr.get(mid)>mountainArr.get(mid+1)){
        end = mid;
        }else{
        start = mid+1;
        }
    }
    return start;
 }
 public int orderAgnosticBs(MountainArray mountainArr, int target, int startPoint, int endPoint){
    boolean isDesc = mountainArr.get(startPoint) > mountainArr.get(endPoint);

    while(startPoint <= endPoint){
        int midPoint = startPoint + (endPoint-startPoint)/2;

        if(mountainArr.get(midPoint) == target){
        return midPoint;
        }
        if(isDesc) {
            if(target<mountainArr.get(midPoint)){
                startPoint = midPoint+1;
            }else{
                endPoint = midPoint-1;
            }
        }else {
            if(target<mountainArr.get(midPoint)){
            endPoint = midPoint-1;
            }else{
            startPoint = midPoint+1;
            }
        }
    }
    return -1;
    }
 }

 */
