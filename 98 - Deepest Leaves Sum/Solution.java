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
    int ans=0;
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=height(root.left);
        int r=height(root.right);
        return Math.max(l,r)+1;
    }
    public void helper(TreeNode root,int h){
        if(root==null){
            return;
        }
        if(h==1){
            ans=ans+root.val;
        }
        helper(root.left,h-1);
        helper(root.right,h-1);
    }
    public int deepestLeavesSum(TreeNode root) {
        int h=height(root);
        helper(root,h);
        return ans;
    }
}
