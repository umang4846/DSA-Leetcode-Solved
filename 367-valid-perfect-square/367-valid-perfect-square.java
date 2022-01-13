class Solution {
    public boolean isPerfectSquare(int num) {
        //TC : O(N)
        //SC : O(1)
        long start = 1;
        long end = num;
        while(start <= end){
            long mid = (start + end) >>> 1;
            if(mid * mid == num){
                return true;
            }else if(mid * mid > num){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return false;
    }
}