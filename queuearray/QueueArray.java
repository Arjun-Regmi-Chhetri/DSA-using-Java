package queuearray;

public class QueueArray {

    int[] arr;

    int begin, end;

    QueueArray(int size){
        arr = new int[size];
        begin=end = -1;

        System.out.println(size);
    }


    public boolean isFull(){
        return end == arr.length - 1;
    }


    public boolean isEmpty(){
        return end == -1 || begin == arr.length;
    }

    public void enQueue(int value){
        if(isFull()){
            System.out.println("full");
        }

        else if (isEmpty()) {
            begin = 0;
            end++;
            arr[end] = value;
            System.out.println("Succesffully inserted "+value+ " in the queue");
        } else {
            end++;
            arr[end] = value;
            System.out.println("Succesffully inserted "+value+ " in the queue");
        }
    }

    public int deQueue(){
        if(isEmpty()){
            return -1;
        }else {
            int result = arr[begin];
            begin++;
            if( begin > end){
                begin = end = -1;
            }
            return result;
        }

    }

    public int peek(){
        if(isEmpty()){
            return  -1;
        }
        else {
            return arr[begin];
        }
    }

    public void deleteQueue(){
        arr = null;
        System.out.println("Deleted");
    }

    public static void main(String[] args) {

        QueueArray queue = new QueueArray(5);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);

        System.out.println("Peek: " + queue.peek()); // Output: Peek: 10

        System.out.println("Dequeue: " + queue.deQueue()); // Output: Dequeue: 10

        System.out.println("Peek: " + queue.peek()); // Output: Peek: 20

        queue.enQueue(40);
        queue.enQueue(50);

        System.out.println("Is the queue full? " + queue.isFull()); // Output: Is the queue full? true

        System.out.println("Dequeue: " + queue.deQueue()); // Output: Dequeue: 20

        queue.deleteQueue();

    }
}
