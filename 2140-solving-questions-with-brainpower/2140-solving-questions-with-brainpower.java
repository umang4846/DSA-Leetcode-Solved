class Solution {
    public long mostPoints(int[][] questions) {
        long[] memo = new long[questions.length];
        Arrays.fill(memo,-1);
        return solve(0,questions,memo);
    }
    private long solve(int index, int[][] questions, long[] memo){
        if(index >= questions.length){
            return 0;
        }
        if(memo[index] != -1){
            return memo[index];
        }
        long pick = questions[index][0] + solve(index+1+questions[index][1],questions,memo);
        long notPick = 0 + solve(index+1,questions,memo);
        memo[index] = Math.max(pick,notPick);
        return memo[index];

    }
}