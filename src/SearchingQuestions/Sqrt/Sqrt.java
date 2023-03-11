package SearchingQuestions.Sqrt;
//https://leetcode.com/problems/sqrtx/description/
public class Sqrt {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(x/mid==mid){
                return mid;
            }else if(x/mid<mid){
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return end;
    }
}
