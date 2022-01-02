class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : time){
            int remainder = i % 60;
            if(remainder == 0){
                ans += map.getOrDefault(0,0);
            }else{
                ans += map.getOrDefault(60 - remainder,0);
            }
            map.put(remainder,map.getOrDefault(remainder,0)+1);
        }
        return ans;
    }
}