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
    // boolean b = ture;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // check(TreeNode root1, TreeNode root2);
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        CheckTreeOne(root1,l1);
        CheckTreeTwo(root2,l2);

        return l1.equals(l2);

        // return false;
    }
    private void CheckTreeOne(TreeNode root,List<Integer> l1){
        if(root == null) return;

        CheckTreeOne(root.left,l1);
        if(root.left == null && root.right == null) l1.add(root.val);
        CheckTreeOne(root.right,l1);
    }
        private void CheckTreeTwo(TreeNode root,List<Integer> l2){
        if(root == null) return;

        CheckTreeTwo(root.left,l2);
        if(root.left == null && root.right == null) l2.add(root.val);
        CheckTreeTwo(root.right,l2);
    }
}