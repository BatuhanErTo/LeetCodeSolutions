package BinarySearchQuestions.Find_position_of_an_element_in_a_sorted_array_of_infinite_numbers;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class FindPosition {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        // If target would be 170, it is going to give an index out of range exception. But in this
        // question we assume that our array's size is infinite... For further explanation please visit
        // the link that I shared above.
        System.out.println(search(arr,10));
    }
    static int search(int[] array, int target){
        int start = 0;
        int end = 1;
        while(target>array[end]){
            int temp = end+1;
            end = end + (end-start+1)*2;
            start = temp;
        }
        return binarySearch(array,target,start,end);
    }
    static int binarySearch(int[] array, int target, int start, int end){
        while(start <= end){
            int midPoint = start + (end-start)/2;
            if(target<array[midPoint]){
                end = midPoint-1;
            }else if(target>array[midPoint]){
                start = midPoint+1;
            }else{
                return midPoint;
            }
        }
        return -1;
    }
}
