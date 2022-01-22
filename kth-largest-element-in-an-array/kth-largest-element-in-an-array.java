class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums,0,nums.length-1,k);
    }
    
    private int quickSelect(int[] nums, int low, int high, int k){
        int pi = partition(nums,low,high);
        int ktemp = k;
        if (pi == nums.length-ktemp) {
            return nums[pi];
        } else if (pi > nums.length-ktemp) {
            return quickSelect(nums, low, pi - 1, k);
        } else {
            return quickSelect(nums, pi + 1, high, k);
        }
    }
    
    private int partition(int[] nums, int low, int high){
        int i = low, j = low;
        int pivot = nums[high];
        while(i <= high){
            if(nums[i] <= pivot){
                swap(nums, i,j);
                i++;
                j++;
            }else{
                i++;
            }
        }
        return j-1;
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}