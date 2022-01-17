class Solution {
    public long mostPoints(int[][] questions) {
        int n= questions.length; 
        long[] dp = new long[n+1];
        dp[n]=0;
        for(int i=n-1;i>=0;i--){
             int nx= questions[i][1]; 
             long pick   = questions[i][0] + ( (i+1+nx<=n) ? dp[i+1+nx] : 0 );
             long notPick = dp[i+1];
             dp[i]= Math.max(pick,notPick);
        }
        return dp[0];
    }
}