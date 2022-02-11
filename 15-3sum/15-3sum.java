class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length < 3) {
            return ans;
        }
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = 0 - nums[i];
            List<List<Integer>> smallList = twoSum(nums, i + 1, target);
            for (List<Integer> list : smallList) {
                list.add(nums[i]);
                ans.add(list);
            }
        }
        return ans;
    
    }
    public List<List<Integer>> twoSum(int[] nums, int start, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int left = start;
        int right = nums.length - 1;
        ;
        while (left < right) {
            if (left != start && nums[left] == nums[left - 1]) {
                left++;
                continue;
            }
            int curr = nums[left] + nums[right];
            if (curr == target) {
                List<Integer> list = new ArrayList<>();
                list.add(nums[left]);
                list.add(nums[right]);
                ans.add(list);
                left++;
                right--;
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            } else if (curr < target) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}