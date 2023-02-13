package BinarySearchQuestions.FloorOfANumber;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,9,13,15,21,25};
        System.out.println(arr[floor(arr,20)]);
    }
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        if(arr[start]>target){
            return -1;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                start = mid+1;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return end;
    }
}

