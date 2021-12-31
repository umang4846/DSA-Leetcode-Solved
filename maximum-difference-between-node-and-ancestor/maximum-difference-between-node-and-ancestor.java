/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxDiff = 0;
    public int maxAncestorDiff(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)){
            return 0;
        }
       return maxAncestorDiff(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
      
    }
    private int maxAncestorDiff(TreeNode root, int min, int max){
        if(root == null){
            return Math.abs(max - min);
        }
        if(root.val < min){
            min = root.val;
        }
        if(root.val > max){
            max = root.val;
        }
       int leftMin = maxAncestorDiff(root.left, min, max);
       int rightMin = maxAncestorDiff(root.right, min, max);
        
       return Math.max(leftMin, rightMin);
        
    }
}