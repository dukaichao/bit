package bit_06_13;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:平衡二叉树的判断
 * User:Mr.Du
 * Date:2019-06-13
 * Time:20:13
 */
public class Balance {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean isBalance(TreeNode root) {
        // write code here
        if(root==null)
            return true;
        if(Math.abs(deepth(root.left)-deepth(root.right))>1)
            return false;
        else
            return isBalance(root.left)&isBalance(root.right);
    }
    public static int deepth(TreeNode root){
        if(root==null)
            return 0;
        return Math.max(deepth(root.left),deepth(root.right))+1;
    }
}
