class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<numbers.length;i++){
            map.put(numbers[i],i);
        }
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i])){
                int[] num = new int[2];
                int index1 = i+1;
                int index2 = map.get(target-numbers[i])+1;
                if(index1 != index2)
                 return new int[]{index1,index2};
            }
        }
        return new int[]{-1,-1};
    }
}