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
    
    String ans = null;
    public String smallestFromLeaf(TreeNode root) {
         solve(root, "");
        return ans;
    }
      void solve(TreeNode root, String s) {

        if (root == null)
            return;

        s = (char)('a' + root.val) + s;

        if (root.left == null && root.right == null) {
            if (ans == null || s.compareTo(ans) < 0)
                ans = s;
            return;
        }

        solve(root.left, s);
        solve(root.right, s);
}
}