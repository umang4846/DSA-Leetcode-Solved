class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int low = j+1;
                int high = nums.length-1;
                while(low < high){
                    int curr = nums[i] + nums[j] + nums[low] + nums[high];
                    if(curr == target){
                       ans.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                       low++;
                       high--;
                       while(low < high && nums[low] == nums[low-1]){
                        low++;
                       }
                       while(low < high && nums[high] == nums[high+1]){
                        high--;
                       }
                    }
                    
                    else if(curr < target){
                        low++;
                    }else{
                        high--;
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}