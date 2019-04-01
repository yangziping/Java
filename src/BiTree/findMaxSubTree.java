package BiTree;

public class findMaxSubTree {
    private static int maxSum = Integer.MIN_VALUE;
    public static int findMaxSubTree0(BiTNode root,BiTNode maxRoot){
        if(root == null)
            return 0;
        int lmax = findMaxSubTree0(root.lchild,maxRoot);
        int rmax = findMaxSubTree0(root.rchild,maxRoot);
        int sum = lmax + rmax + root.data;
        if(sum > maxSum) {
            maxSum = sum;
            maxRoot.data = root.data;
        }
        return maxSum;
    }
    public static void main(String[] args){
        BiTNode root = (new isEqual()).constructTree();
        BiTNode maxRoot = new BiTNode();
        int maxSum = findMaxSubTree0(root,maxRoot);
        System.out.println("max subTree sum: " + maxSum + "对应的根节点:" + maxRoot.data);
    }
}
