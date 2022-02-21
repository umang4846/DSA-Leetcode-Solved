class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int half = nums.length/2;
        for(Integer key : map.keySet()){
            if(map.get(key) > half){
                return key;
            }
        }
        return -1;
    }
}