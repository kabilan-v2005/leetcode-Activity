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
    List<TreeNode> l = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        // first traverse thorugh tree and make a list 
        // while using in order we can get sorted list
        inOrder(root);
        return BuildBalanceTree(0,l.size()-1);

    }
    void inOrder(TreeNode root){
        if( root == null ) return;

        inOrder(root.left);
        l.add(root);
        inOrder(root.right);
    }
    // method to build a balance tree
    TreeNode BuildBalanceTree(int s,int e){
        if(s > e) return null;
        int mid = (s + e)/2;

        TreeNode root = l.get(mid);

         root.left = BuildBalanceTree(s, mid-1);
         root.right = BuildBalanceTree(mid+1 , e);

        return root;

    }
}