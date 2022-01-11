class Solution {
    public int mySqrt(int x) {
        if (x==0||x==1) {
            return x;
        }
        long start  = 0;
        long end = x;
        int ans = 0;
        while (start<=end){
            long mid = start +(end -start)/2;
            if(mid*mid == x) return (int)mid;
            if (mid*mid>x){
                end = mid-1;
            }
            else {
                // might be possible answer
                 ans = (int)mid;
                start = mid +1;
            }

        }
        return ans;
   }
}