package binarytree;

public class BinaryTree {

    String[] arr;
    int end;

    BinaryTree(int size){
        arr = new String[size + 1];
        end = 0;
    }

    public boolean isFull(){
        return end == arr.length -1;
    }


    public void insert(String value){
        if(!isFull()){
            arr[++end] = value;
            System.out.println(value + " added");
        }else{
            System.out.println("full");
        }
    }

    public void preOrder(int index){
        if(index > end){
            return;
        }
        System.out.println(arr[index]);
        preOrder(index * 2);

        preOrder(index * 2 + 1);
    }
    public void inOrder(int index){
        if(index > end){
            return;
        }


        inOrder(index * 2);
        System.out.println(arr[index]);
        inOrder((index * 2 + 1));
    }



    public void postOrder(int index){
        if(index > end){
            return;
        }
        postOrder(2 * index);
        postOrder(2 * index + 1);
        System.out.println(arr[index]);
    }

    public void levelOrder(){
        for (int i = 1; i < end; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public int search(String value){
        for(int i =1; i < end; i++){
            if(arr[i] == value){
                System.out.println("Exist");
                return i;
            }
        }
        System.out.println("Not exists");
        return -1;

    }

    public void delete(String value){
        int loc = search(value);

        if(loc == -1){
            return;
        }else{
            arr[loc] = arr[end];
            end--;
            System.out.println("Delete");
        }
    }

    public void deleteBT(){
        try {
            arr = null;
            System.out.println("Deleted");
        }catch (Exception e){
            System.out.println("Error");
        }
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(6);
        tree.insert("A");
        tree.insert("B");
        tree.insert("C");
        tree.insert("D");
        tree.insert("E");
        tree.insert("F");
        tree.insert("G");

        System.out.println("Pre-order traversal:");
        tree.preOrder(1);
        System.out.println();

        System.out.println("In-order traversal:");
        tree.inOrder(1);
        System.out.println();

        System.out.println("Post-order traversal:");
        tree.postOrder(1);
        System.out.println();

        System.out.println("Level-order traversal:");
        tree.levelOrder();
        System.out.println();

        tree.search("C");

        tree.delete("C");

        System.out.println("In-order traversal after deleting 'C':");
        tree.inOrder(1);
        System.out.println();

        tree.deleteBT();
    }
}
