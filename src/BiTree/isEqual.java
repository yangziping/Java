package BiTree;

public class isEqual{
    public static boolean isEqual0(BiTNode root1, BiTNode root2){
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null )
            return false;
        if(root1.data == root2.data)
            return isEqual0(root1.lchild,root2.lchild)&&isEqual0(root1.rchild,root2.rchild);
        else
            return false;
    }
    public static BiTNode constructTree(){
        BiTNode root = new BiTNode();
        BiTNode node1 = new BiTNode();
        BiTNode node2 = new BiTNode();
        BiTNode node3 = new BiTNode();
        BiTNode node4 = new BiTNode();
        root.data = 6;
        node1.data = 3;
        node2.data = -7;
        node3.data = -1;
        node4.data = 9;
        root.lchild = node1;
        root.rchild = node2;
        node1.lchild = node3;
        node1.rchild = node4;
        node2.lchild = node2.rchild = node3.lchild = node3.rchild = node4.lchild = node4.rchild = null;
        return root;
    }
    public static void main(String[] args){
        BiTNode root1 = constructTree();
        BiTNode root2 = constructTree();
        boolean equal = isEqual0(root1,root2);
        if(equal)
            System.out.println("这两棵树相等。");
        else
            System.out.println("这两棵树不相等。");


    }
}
