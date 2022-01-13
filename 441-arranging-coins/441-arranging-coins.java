class Solution {
    public int arrangeCoins(int n) {
        long used = 0;
        long i = 1;
        for(;i<=n;i++){
            if(used + i <= n){
                used += i;
            }else{
                break;
            }
        }
        return (int)i-1; 
    }
}