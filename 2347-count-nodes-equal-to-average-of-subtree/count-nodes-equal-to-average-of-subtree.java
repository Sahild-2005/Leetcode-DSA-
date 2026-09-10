class Solution {
      int countNodesEqual=0;
    public int sum(TreeNode root) {

        if (root == null)
            return 0;

        int left = sum(root.left);
        int right = sum(root.right);

        return root.val + left + right;
    }

    public int count(TreeNode root) {

        if (root == null)
            return 0;

        return 1 + count(root.left) + count(root.right);
    }

    public int averageOfSubtree(TreeNode root) {
        // root with avg equal 

        if(root == null) return 0;
        // first avg of root then left and then right 
        int avg = sum(root)/count(root);

        if(root.val==avg) countNodesEqual++;

        int left = averageOfSubtree(root.left);
        int right = averageOfSubtree(root.right);

        return countNodesEqual;
    }
}