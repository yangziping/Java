package BiTree;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
}
class IntRef{
    public int val;
}
public class findMaxPathSum {
    int Max(int a, int b, int c){
        int max = a > b ? a : b;
        max = max > c ? max : c;
        return max;
    }
    public int findMaxPathrecursive(TreeNode root,IntRef max) {
        if (root == null)
            return 0;
        else {
            int sumLeft = findMaxPathrecursive(root.left, max);
            int sumRight = findMaxPathrecursive(root.right, max);
            int allMax = sumLeft + sumRight + root.val;
            int leftMax = sumLeft + root.val;
            int rightMax = sumRight + root.val;
            int tmpMax = Max(allMax, leftMax, rightMax);
            if (tmpMax > max.val)
                max.val = tmpMax;
            int subMax = sumLeft > sumRight ? sumLeft : sumRight;
            return root.val + subMax;
        }
    }
        public int findMaxPath(TreeNode root){
            //int max = Integer.MIN_VALUE;
            IntRef max = new
            if(root == null)
                return 0;
            else{
                findMaxPathrecursive(root,max);
            }
        }
    }
}
