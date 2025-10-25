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
    private int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum=Integer.MIN_VALUE;
        dfs(root);
        return maxSum;
    }
    public int dfs(TreeNode node){
        if(node==null) return 0;
        int left=Math.max(dfs(node.left),0);
        int right=Math.max(dfs(node.right),0);
        int currentSum=node.val+left+right;
        maxSum=Math.max(currentSum,maxSum);
        return node.val+Math.max(left,right);
    }
}
