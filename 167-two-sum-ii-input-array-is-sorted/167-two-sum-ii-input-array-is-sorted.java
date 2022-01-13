class Solution {
    //TC : O(NlogN)
    //SC : O(1)
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            int num = numbers[i];
            int start = i+1;
            int end = numbers.length-1;
            int gap = target - num;
            while(start <= end){
                int mid = (start + end) >>> 1;
                if(numbers[mid] == gap){
                    return new int[]{i+1,mid+1};
                }else if(numbers[mid] > gap){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return new int[]{-1,-1};
    }
}