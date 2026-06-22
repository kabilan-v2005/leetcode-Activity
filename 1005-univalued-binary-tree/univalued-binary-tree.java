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
    int f = 0;
    public boolean isUnivalTree(TreeNode root) {
        inOrder(root,root.val);
        if(f == 1) return false;
        return true;
    }
    private void inOrder(TreeNode root,int val){
        if(root == null) return;

        if(root.val != val) f = 1;

        inOrder(root.left,val);
        inOrder(root.right,val);
    }
}