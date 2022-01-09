class Solution {
    int dy[] = new int[]{0, -1, 1};
    int memo[][][] = new int[71][71][71];
    
    public int cherryPickup(int[][] grid) {
        int m = grid.length;
        if (m == 0){
          return 0;  
        } 
        int n = grid[0].length;
        for(int i=0;i<71;i++){
            for(int j=0;j<71;j++){
                for(int k=0;k<71;k++){
                    memo[i][j][k] = -1;
                }
            }
        }
        return dfs(grid, 0, 0, n-1, m, n);
    }
    
     int dfs(int[][] grid, int i, int c1, int c2, int m, int n) {

        if (i == m){
         return 0;   
        }
        if (c1 < 0 || c2 < 0 || c1 >= n || c2 >= n){
            return Integer.MIN_VALUE;
        }
        if (memo[i][c1][c2] != -1){
          return memo[i][c1][c2];  
        } 
        
        int maxAns = 0;
        
        for (int k=0; k<3; k++) {
            for (int r=0; r<3; r++) {
                maxAns = Math.max(maxAns, dfs(grid, i + 1, c1 + dy[k], c2 + dy[r], m, n));
            }
        }
        
        maxAns += (c1 == c2) ? grid[i][c1] : grid[i][c1] + grid[i][c2];
        memo[i][c1][c2] = maxAns;
        return maxAns;
    }
}