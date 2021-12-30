class Solution {
    public int smallestRepunitDivByK(int k) {
        int prevRemainder = 0;
        for(int N = 1; N<=k; N++){
            prevRemainder = (prevRemainder * 10 + 1) % k;
            
            if(prevRemainder % k == 0){
                return N;
            }
        }
        return -1;
    }
}