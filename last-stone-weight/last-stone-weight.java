class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            pq.add(stone);
        }
        while(pq.size() > 1){
            int stone1 = pq.poll();
            int stone2 = pq.poll();
            int left = stone1 - stone2;
            if(left > 0){
                pq.add(left);
            }
        }
        return pq.size() == 1 ? pq.peek() : 0;
    }
}