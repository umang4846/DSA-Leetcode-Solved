class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] arr = new int[n+1];
        for(int[] t : trust){
            int trustBy = t[0];
            int trustIn = t[1];
            arr[trustBy] = --arr[trustBy];
            arr[trustIn] = ++arr[trustIn];
        }
        System.out.println(Arrays.toString(arr));
        for(int i=1; i<=n;i++){
            if(arr[i] == n-1){
                return i;
            }
        }
        return -1;
    }
}