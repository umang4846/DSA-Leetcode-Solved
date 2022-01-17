class Solution {
    public int findKthPositive(int[] arr, int k) {
       int count =1;
       int index = 0;
        while(index<arr.length && k>0){
            if(arr[index] != count){
                k--;
            }else{
                index++;
            }
            count++;
        }
        while(k > 0){
            count++;
            k--;
        }
        return count-1;
    }
}