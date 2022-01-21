class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalFuel = 0;
        int totalCost = 0;
        int n = gas.length; // both array has same length
        
        for(int i=0;i<n;i++){
            totalFuel += gas[i];
        }
        for(int i=0;i<n;i++){
            totalCost += cost[i];
        }
        if(totalCost > totalFuel){
            return -1;
        }
        
        int current = 0;
        int start = 0;
        
        for(int i=0;i<n;i++){
            current += gas[i] - cost[i];
            if(current < 0){
                start = i+1;
                current = 0;
            }
        }
        return start;
            
    }
}