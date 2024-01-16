package binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySeachTree {

    static class BinaryNode {

        public int value;
        int root;
        BinaryNode left, right;

        public BinaryNode(int value) {
            this.root = value;
            this.left = this.right = null;
        }
    }

    BinaryNode root;

    BinarySeachTree(){
        root = null;
    }

    private BinaryNode insert(BinaryNode node, int value){
        if(node == null){
            BinaryNode nodes = new BinaryNode(value);
            nodes.value = value;
            return nodes;
        }
        if(value < node.value){
            return insert(node.left, value);
        }else{
            return insert(node.right, value);
        }
    }
    void insert(int value){
        root = insert(root,value);
    }

    void preOrder(BinaryNode node){
        if(node == null){
            return;
        }
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(BinaryNode node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    void postOrder(BinaryNode node){
        if(node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }


    void levelOrder(){

        Queue<BinaryNode> q = new LinkedList<BinaryNode>();

        q.add(root);

        while(!q.isEmpty()){
            BinaryNode node = q.remove();
            if(node.left != null){
               q.add(node.left);
            }else{
                q.add(node.right);
            }
        }

    }

    BinaryNode search(BinaryNode node, int value){
        if(node == null){
            return null;
        }
        else if(node.value == value){
            return node;
        }else if(value < node.value){
            return search(node.left, value);
        }else{
            return search(node.right, value);
        }
    }


    static BinaryNode minimumNode(BinaryNode node){
        if(node.left == null){
            return node;
        }else{
            return minimumNode(node.left);
        }
    }

    BinaryNode delete(BinaryNode node, int value){
        if(node == null){
            return null;
        }
        if( value < node.value){
            return delete(node.left, value);
        }
        else if( value > node.value){
            return delete(node.right, value);
        }else{
            if(node.left != null && node.right != null){
                BinaryNode temp = node;
                BinaryNode minimumForRight = minimumNode(temp.right);
                node.right = delete(node.right, minimumForRight.value);
            }else if(node.left != null){
                root = delete(node.left,value);
            }else if(node.right != null){
                root = delete(node.right, value);
            }else{
                return null;
            }
        }
        return node;
    }





    public static void main(String[] args) {

    }
}
