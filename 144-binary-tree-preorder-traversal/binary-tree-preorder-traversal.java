class Solution {
    List<Integer>  ans = new ArrayList<>();

      private void preorder(TreeNode root){

            if(root==null) return;

            ans.add(root.val);
            preorder(root.left);
            preorder(root.right);
            
      }

    public List<Integer> preorderTraversal(TreeNode root) {

    //        if(root==null) return 0; 

    //     // recursion 

    //     // work + root , left, right  
    //     ans.add(root.val);
    //   if(root.left!=null) return  preorderTraversal(root.left);
    //  if(root.right!=null ) return preorderTraversal(root.right);
    //     return ans;



        ans = new ArrayList<>();
        preorder(root);
        return ans;
    }
}