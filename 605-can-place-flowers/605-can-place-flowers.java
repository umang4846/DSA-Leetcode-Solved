class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;
        if(n==0){
            return true;
        }
        for(int i=0;i<size;i++){
            if(n == 0){
                return true;
            }
            if(flowerbed[i] == 0 && (i==0 || flowerbed[i-1] == 0) && (i==size-1 ||flowerbed[i+1] == 0)){
                flowerbed[i] = 1;
                n--;
            }
        }
        return !(n>0);
    }
}