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
    public void inorder(TreeNode root,ArrayList<Integer> l){
        if(root==null){
            return;
        }
        inorder(root.left,l);
        l.add(root.val);
        inorder(root.right,l);
    }
    public TreeNode bst(ArrayList<Integer> l,int st,int end){
        if(st>end){
            return null;
        }

        int mid=(st+end)/2;

        TreeNode root=new TreeNode(l.get(mid));
        root.left=bst(l,st,mid-1);
        root.right=bst(l,mid+1,end);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> l=new ArrayList<>();
        inorder(root,l);
        return bst(l,0,l.size()-1);
    }
}
