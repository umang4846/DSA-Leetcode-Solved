class Solution {
    public int findPairs(int[] nums, int k) {
        int ans = 0;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j]) == k){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    set.add(list);
                }
                if(Math.abs(nums[i] - nums[j]) > k){
                    break;
                }
            }
        }
        return set.size();
    }
}