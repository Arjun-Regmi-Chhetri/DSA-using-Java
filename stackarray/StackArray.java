package stackarray;

public class StackArray {

    int[] arr;
    int end;

    StackArray(int size) {
        arr = new int[size];
        end = -1;
    }

    public boolean isEmpty() {
        return end == -1;
    }

    public boolean isFull() {
        return end == arr.length - 1;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Full");
        }else if(isEmpty()){
            arr[++end] = value;
            System.out.println(value + " pushed to the stack.");
        }else{
            arr[++end] = value;
            System.out.println(value + " pushed to the stack.");
        }
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }else{

            int result = arr[end];
            end--;
            return result;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        } else {
            return arr[end];
        }
    }




    public static void main(String[] args) {
        StackArray s = new StackArray(5);

        s.isEmpty();
        s.isFull();
        s.push(10);
        s.push(20);
        s.push(40);

        System.out.println("Popped element: " + s.pop());

        System.out.println("Top element: " + s.peek());

    }
}
