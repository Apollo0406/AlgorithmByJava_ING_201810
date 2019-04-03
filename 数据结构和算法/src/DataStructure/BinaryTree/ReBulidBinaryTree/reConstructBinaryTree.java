package DataStructure.BinaryTree.ReBulidBinaryTree;

import java.util.Scanner;

public class reConstructBinaryTree {
    //二叉树定义
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }



    //重建二叉树，参数为前序和中序遍历的结果
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        //前序、中序结果长度要一致
        if (pre.length != in.length || pre == null || pre.length <= 0) {
            return null;
        }
        return construct(pre,0,pre.length-1,in,0,in.length-1);
    }

    private static TreeNode construct(int[] pre, int preS, int preE, int[] in, int inS, int inE) {
        //找到root
        TreeNode root = new TreeNode(pre[preS]);
       /* //建立计数器，用来计算在中序中过了几个值到达root
        int count = 0;
        //拿root的值去中序里找对应下标
        int inIndex = 0;
        while(in[inIndex] != root.val){
            inIndex++;
        }
        //根据下标将中序分成左右子树俩部分
        root.left = construct(pre,preS+1,preS+count,in,inS,inIndex-1);
        root.right = construct(pre,preS+count+1,preE,in,inIndex+1,inE);
        return root;*/
        for(int i = inS; i<= inE; i++){
            if(pre[preS] == in[i]){ //重构左子树，注意边界条件
                 root.left = construct(pre,preS+1,preS+i-inS,in,inE,i-1);
                 //重构右子树，注意边界条件
                 root.right = construct(pre,preE+i+1-inS,preE,in,i+1,inE);
            }
        }
        return root;
        }


    public static void main(String[] args) {
        int[] pre = {3,9,20,15,7};
        int[] in  = {9,3,15,20,7};

       TreeNode answer = reConstructBinaryTree(pre,in);
        printTree(answer);
    }

    public static void printTree(TreeNode node){
        if(node!=null){
                         printTree(node.left);
                         System.out.print(node.val+" ");
                         printTree(node.right);
                }
    }

}

