class Solution {
    public int findJudge(int n, int[][] trust) {
        int[][] arr = new int[n][n];
        for(int i =0 ;i<trust.length;i++){
            int e1 = trust[i][0] - 1;
            int e2 = trust[i][1] - 1;
            arr[e1][e2] = 1;
        }
        int index = -1;
        for(int i=0; i<n; i++){
            boolean isFound = true;
            for(int j=0; j<n; j++){
                if(arr[i][j] == 1){
                    isFound = false;
                    break;
                }
            }
            if(isFound){
                index = i;
            }
        }
        if(index == -1){
            return -1;
        }
        for(int i=0; i<n;i++){
            if(i != index && arr[i][index] == 0){
                return -1;
            }
        }
        return index+1;
    }
}