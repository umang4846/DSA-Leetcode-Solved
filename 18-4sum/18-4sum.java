class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       List<List<Integer>> ans = new ArrayList<>();
        if (nums.length < 4) {
            return ans;
        }
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - 4; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j <= nums.length - 3; j++) {
                if (j != i+1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int smallTarget = target - nums[i] - nums[j];
                List<List<Integer>> smallList = twoSum(nums, j + 1, smallTarget);
                for (List<Integer> list : smallList) {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    ans.add(list);
                }
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