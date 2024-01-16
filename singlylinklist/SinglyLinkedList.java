package singlylinklist;
class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }

}
public class SinglyLinkedList {


        public Node head, tail;

        SinglyLinkedList(){
            this.head = null;
            this.tail = null;
        }

        void insert(int data){

            Node node = new Node(data);

            if(head == null){
                head = node;
                tail = node;
            }else{

                tail.next = node;
                tail = node;

            }


        }

        void traverse(){
            Node temp = head;

            if(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }else{
                System.out.println("null");
            }
        }


        public boolean search(int data){

            Node node = head;

            while(node != null){
                if(node.data == data ){
                    return true;
                }
                node = node.next;
            }

            return false;

        }


        public void delete(int data){

            if( head == null){
                return;
            }

            if(head.data == data){

                head = head.next;

                if( head == null){

                    tail = null;

                }

                return;

            }

            Node temp = head;

            while(temp.next != null && temp.next.data != data){
                temp = temp.next;
            }

            if(temp.next == null){
                System.out.println("not found");
            }else{
                temp.next = temp.next.next;
                if(temp.next != null){
                    tail = temp;
                }
            }



    }



    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);

        System.out.println("Original Linked List:");
        linkedList.traverse();

        int searchData = 3;
        System.out.println("Search for node with data " + searchData + ": " + linkedList.search(searchData));

        linkedList.delete(2);
        System.out.println("Linked List after deleting node with data 2:");
        linkedList.traverse();
    }

}
