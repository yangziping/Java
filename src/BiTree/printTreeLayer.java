package BiTree;
import java.util.Queue;
import java.util.LinkedList;
import BiTree.arrayToBiTree.*;
public class printTreeLayer {
    public static void main(String[] args){
        int[] arr = {23,45,8,465,32,4,878,5676};
        BiTNode root = (new arrayToBiTree()).arraytotree(arr,0,arr.length - 1);
        System.out.println("树的层序遍历是:");
        printTreeLayer0(root);
    }

    public static void printTreeLayer0(BiTNode root){
        if (root == null)
            return;
        BiTNode p;
        Queue<BiTNode>queue = new LinkedList<BiTNode>();
        queue.offer(root);
        while(queue.size() > 0){
            p = queue.poll();
            System.out.print("  " + p.data);
            if(p.lchild != null)
                queue.offer(p.lchild);
            if(p.rchild != null)
                queue.offer(p.rchild);
        }
    }

}
