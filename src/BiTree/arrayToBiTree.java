package BiTree;

class BiTNode{
    int data;
    BiTNode lchild,rchild;
}
public class arrayToBiTree {
    public static BiTNode arraytotree(int[] arr,int start,int end){
        BiTNode root = null;
        if(end >= start){
            int mid = (start + end) / 2;
            root = new BiTNode();
            root.data = arr[mid];
            root.lchild = arraytotree(arr,start,mid - 1);
            root.rchild = arraytotree(arr,mid + 1,end);
        }else{
            root = null;
        }
        return root;
    }
    public static void printTreeMidOrder(BiTNode root){
        if(root == null)
            return;
        if(root.lchild != null)
            printTreeMidOrder(root.lchild);
        System.out.print(root.data + "  ");
        if(root.rchild != null)
            printTreeMidOrder(root.rchild );
    }
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8};
        System.out.println("原来的数组:");
        for(int a : array)
            System.out.print("  " + a);
        System.out.println();
        BiTNode root;
        root = arraytotree(array,0,array.length - 1);
        System.out.println("转换成树后中序遍历:");
        printTreeMidOrder(root);

    }
}
