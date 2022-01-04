class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            int fre = map.getOrDefault(nums[i],0);
            map.put(nums[i],fre+1);
        }
        for(int i : map.keySet()){
            if(map.get(i) == 1){
                return i;
            }
        }
        return -1;
    }
}