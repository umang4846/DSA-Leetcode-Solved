class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = Integer.MIN_VALUE;
        int m = accounts.length;
        int n = accounts[0].length;
        for(int i=0; i<m;i++){
            int w = 0;
            for(int j=0;j<n;j++){
                w += accounts[i][j];
            }
            if(w > wealth){
                wealth = w;
            }
        }
        return wealth;
    }
}