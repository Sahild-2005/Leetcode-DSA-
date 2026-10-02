class Solution {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {

        if(root == null) return ans;

        // Root
        ans.add(root.val);

        // Left
        if(root.left != null)
            preorderTraversal(root.left);

        // Right
        if(root.right != null)
            preorderTraversal(root.right);

        return ans;
    }
}