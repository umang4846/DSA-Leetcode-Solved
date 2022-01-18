class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;
        if(n==0){
            return true;
        }
        if(size == 1 && flowerbed[0] == 0 && n==1){
            return true;
        }
        for(int i=0;i<size;i++){
            if(n == 0){
                return true;
            }
            if(i == 0 && flowerbed[i] == 0){
                if(i != size-1 && flowerbed[i+1] == 0){
                    flowerbed[i] = 1;
                    n--;
                }else if(i == size-1){
                    flowerbed[i] = 1;
                    n--;
                }else{
                    continue;
                }
            }else if(i == size-1 && flowerbed[i] == 0 && flowerbed[i-1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
            else{
                if(flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return !(n>0);
    }
}