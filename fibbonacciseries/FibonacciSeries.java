package fibbonacciseries;

public class FibonacciSeries {

    static int fib(int n){

        if(n <= 1){
            return 1;
        }
        return fib(n- 1) + fib(n- 2);

    }

    public static void main(String[] args) {


        int n = 10;

        for(int i = 0 ; i < n; i++){
            System.out.println(fib(i) + " ");
        }

    }

}
