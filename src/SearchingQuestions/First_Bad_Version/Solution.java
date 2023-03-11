package SearchingQuestions.First_Bad_Version;
//https://leetcode.com/problems/first-bad-version/description/
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
/**
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lowest = 1;
        int highest = n;
        while(lowest<=highest){
            int mid = lowest + (highest-lowest)/2;
            if(isBadVersion(mid)){
                highest = mid - 1;
            }else{
                lowest = mid + 1;
            }
        }
        return lowest;
    }
}
 **/