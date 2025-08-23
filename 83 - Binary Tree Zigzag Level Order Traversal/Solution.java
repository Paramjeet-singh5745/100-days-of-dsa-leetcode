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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        int level = 0;
        if (root == null) {
            return ans;
        }
        Stack<TreeNode> main = new Stack<>();
        Stack<TreeNode> helper = new Stack<>();

        main.push(root);
        while (main.size() > 0) {
            TreeNode curnode = main.pop();
            cur.add(curnode.val);

            if (level == 0) {
                if (curnode.left != null) {
                    helper.push(curnode.left);
                }
                if (curnode.right != null) {
                    helper.push(curnode.right);
                }

            } else {
                if (curnode.right != null) {
                    helper.push(curnode.right);
                }
                if (curnode.left != null) {
                    helper.push(curnode.left);
                }
            }

            if (main.size() == 0) {
                ans.add(cur);
                cur = new ArrayList<>();
                level = 1 - level;
                main = helper;
                helper = new Stack<>();
            }

        }

        return ans;
    }
}
