
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null)return true;

        return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean helper(TreeNode node,long min,long max){
        if(node==null)return true;
        if(node.val<=min||node.val>=max)return false;
        // boolean leftree=helper(node.left,min,node.val);
        // boolean rightree=helper(node.right,node.val,max);
        return helper(node.left,min,node.val)&&helper(node.right,node.val,max);
    }
}