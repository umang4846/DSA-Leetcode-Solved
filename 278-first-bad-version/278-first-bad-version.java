/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int possibleAns = -1;
        while(start <= end){
            int mid = (start + end) >>> 1;
            boolean ans = isBadVersion(mid);
            if(ans == true){
                possibleAns = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return possibleAns;
    }
}