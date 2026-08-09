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
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        dfs(root,low,high);
        return sum;
    }
    void dfs(TreeNode root,int l,int h){
        if(root == null) return;

        if(root.val >= l && root.val <= h) sum+=root.val;
        dfs(root.left,l,h);
        dfs(root.right,l,h);

        // return;
    }
}