class Solution {
    public boolean winnerSquareGame(int n) {
        Boolean[] memo=new Boolean[n+1];
        memo[0]=false;
        return helper(n,memo);
    }
    private boolean helper(int n, Boolean[] memo){
        if (memo[n]!=null) return memo[n];
        for (int i=1; i*i<=n; i++){
            if (!helper(n-i*i,memo)){
                memo[n]=true;
                break;
            }
        }
        if (memo[n]==null){
            memo[n]=false;
        }
        return memo[n];
    }
}