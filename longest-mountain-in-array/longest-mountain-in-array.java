class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length < 3){
            return 0;
        }
        
        int ans = 0;
        for(int i = 0; i<arr.length-1; i++){
            int lm = 0;
            int j = i;
            for(;j<arr.length-1; j++){
                if(arr[j] < arr[j+1]){
                    lm++;
                }else{
                    break;
                }
            }
            int rm = 0;
            for(int j1 = j; j1<arr.length-1; j1++){
                if(arr[j1] > arr[j1+1]){
                    rm++;
                }else{
                    break;
                }
            }
            System.out.println(lm +" "+rm);
            if(lm > 0 && rm > 0){
                ans = Math.max(ans,(lm + rm + 1));
            }
        }
        return ans;
    }
}