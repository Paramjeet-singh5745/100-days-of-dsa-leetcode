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
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();

        if(root==null){
            return l;
        }
        Queue<TreeNode> q1=new ArrayDeque<>();
        Queue<TreeNode> q2=new ArrayDeque<>();

        q1.add(root);
        while(q1.size()>0){
            TreeNode curn=q1.remove();
            curr.add(curn.val);

            if(curn.left!=null){
                q2.add(curn.left);
            }
            if(curn.right!=null){
                q2.add(curn.right);
            }

            if(q1.size()==0){
                l.add(curr);
                curr=new ArrayList<>();
                q1=q2;
                q2=new ArrayDeque<>();
            }

        }
        return l;
    }
}
