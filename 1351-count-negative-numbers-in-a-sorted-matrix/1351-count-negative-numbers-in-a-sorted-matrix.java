class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int row =0; row<grid.length; row++){
            for(int col = grid[0].length - 1; col>=0; col--)
                if(grid[row][col] < 0){
                    count++;
                }else{
                    break;
                }
        }
        return count;
    }
}