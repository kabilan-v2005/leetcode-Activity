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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        levelorder(root, res);
        return res;
    }
    private void levelorder(TreeNode root, List<List<Integer>> res){
        if(root == null) return;
        // ArrayList<Integer> l = new ArrayList<>();
        // l.add(root.val);
        // res.add(l);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0;i < size;i++){
            TreeNode curr = q.poll();
            list.add(curr.val);
            if(curr.left != null) {
                q.add(curr.left);
                // list.add(curr.left.val);
            }
            if(curr.right != null){
                q.add(curr.right);
                // list.add(curr.right.val);
            }
            }
            res.add(list);
        } 
        // return res;
    }
}