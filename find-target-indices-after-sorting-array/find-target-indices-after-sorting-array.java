class Solution {
    //TC : O(N) counting sort
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int targetCount = 0;
        int lessThanTargetCount = 0;
        for(int i =0; i<nums.length;i++){
            if(nums[i] == target){
                targetCount++;
            }
            if(nums[i] < target){
                lessThanTargetCount++;
            }
        }
        for(int i =0; i<targetCount; i++){
            ans.add(lessThanTargetCount++);
        }
        return ans;
    }
}