/**
 * Definition for a binary tree node.,
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
    public int countNodes(TreeNode root) {
        int leftDepth=leftDepth(root);
        int rightDepth=rightDepth(root);

    if(leftDepth == rightDepth){
        return (int) Math.pow(2,leftDepth) -1;
    }
    return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public static int leftDepth(TreeNode root){
        int dep=0;
        while(root!=null){
            root=root.left;
            dep++;
        }
        return dep;
    }
    public static int rightDepth(TreeNode root){
        int dep=0;
        while(root!=null){
            root=root.right;
            dep++;
        }
        return dep;
    }
}