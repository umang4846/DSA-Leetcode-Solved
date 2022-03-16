class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int N = pushed.length;
        int j = 0;
        Stack<Integer> stack = new Stack();
        
        for(int n : pushed){
            stack.push(n);
            while(!stack.isEmpty() && j < popped.length && stack.peek() == popped[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();

    }
}