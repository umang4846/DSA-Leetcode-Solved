class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;
        for(int i=0;i<nums.length;i++){
            if(target == nums[i]){
                start = i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(target == nums[i]){
                end = i;
                break;
            }
        }
        return new int[]{start,end};
    }
}