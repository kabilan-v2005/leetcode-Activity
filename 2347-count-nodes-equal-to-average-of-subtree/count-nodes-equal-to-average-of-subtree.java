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
    int count = 0;
    public int averageOfSubtree(TreeNode root){
        helper(root);
        return count;
    }
    int[] helper(TreeNode root){
        if(root == null){
            return new int[] {0,0};
        }

        int[] leftarr = helper(root.left);
        int[] rightarr = helper(root.right);

        int sum = leftarr[0] + rightarr[0] + root.val;
        int numofnode = leftarr[1] + rightarr[1] + 1;

        if(sum / numofnode == root.val){
            count++;
        }

        return new int[] {sum, numofnode};

    }
}