class Solution {
    public int maxDistToClosest(int[] seats) {
        //TC : O(N)
        //SC : O(N)
        int N = seats.length;
        int prefixZero = -1;
        int suffixZero = -1;
        int maxZero = -1;
        int zero = 0;

        for (int i = 0; i < N; ++i) {
            if (seats[i] == 0) {
                zero++;
            }
            else {
                if(prefixZero == -1){
                    prefixZero = zero;
                }else{
                    maxZero = Math.max(maxZero,zero);
                }
                zero = 0;
            } 
        }
        suffixZero = zero;

        
        return Math.max(prefixZero,Math.max(suffixZero, (maxZero+1)/2));
    }
}