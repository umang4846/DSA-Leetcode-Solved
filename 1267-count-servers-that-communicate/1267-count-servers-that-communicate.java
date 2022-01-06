class Solution {
    int ans=0;
    public int countServers(int[][] grid) {
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                if((grid[row][col] == 1)){
                    boolean isFound = false;
                    for(int i=0;i<grid[0].length;i++){
                        if(grid[row][i] == 1 && i != col){
                            ans++;
                            isFound = true;
                            break;
                        }
                    }
                    for(int i=0; !isFound && i<grid.length;i++){
                        if(grid[i][col] == 1 && i != row){
                            ans++;
                            break;
                        }
                    }
                }
            }
        }
        return ans;
    }
}