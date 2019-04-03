/*
package DataStructure.BinaryTree.ReBulidBinaryTree;

import java.util.Arrays;

public class reTree {

    public class BinaryTreeNode{
        int val;
        BinaryTreeNode leftChild;
        BinaryTreeNode rightChild;
        public BinaryTreeNode(int val){
            this.val = val;
        }
    }
    public static BinaryTreeNode reBuildBinaryTree(int pre[],int order[]){
        //判断输入数据的合法性
        if(pre==null||order==null||pre.length!=order.length)
            return null;
        Interview7 i7=new Interview7();
        BinaryTreeNode root=null;
        for(int i=0;i<order.length;i++)
        {
            if(order[i]==pre[0])
            {
                //找到根节点
                root=i7.new BinaryTreeNode(order[i]);
                //找到左子树
                root.leftChild=reBuildBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(order, 0, i));
                //找到右子树
                root.rightChild=reBuildBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(order, i+1, order.length));
            }
        }
        return root;
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};

    }
}
*/
