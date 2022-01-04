class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int[] arr = new int[k];
        int index = 0;
        for(int i=nums.length-k; i<nums.length;i++){
            arr[index++] = nums[i];
        }
        for(int i=nums.length-1-k;i>=0;i--){
            nums[i+k] = nums[i];
        }
        for(int i=0; i<k;i++){
            nums[i] = arr[i];
        }
    }
}

// 1 2 3 4 5 6 7