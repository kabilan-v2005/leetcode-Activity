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
    List<TreeNode> list = new ArrayList<>();
    public void flatten(TreeNode root) {
        if(root == null) return;
        preorder(root);

        for(int i = 0;i < list.size() - 1;i++){
            TreeNode curr = list.get(i);
            TreeNode next = list.get(i + 1);
            curr.left = null;
            curr.right = next;
        }
        TreeNode last = list.get(list.size() - 1);
        last.left = null;
        last.right = null;
    }
    void preorder(TreeNode root){
        if(root == null) return;

        list.add(root);
        preorder(root.left);
        preorder(root.right);
    }
    
}