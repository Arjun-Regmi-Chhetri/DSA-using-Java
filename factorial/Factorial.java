package factorial;

public class Factorial {

    static int factorial(int num){

        if( num ==1 || num ==0){
            return 1;
        }else{
            return num * factorial(num - 1);
        }

    }

    public static void main(String[] args) {
        int num = 6;
        int res = factorial(num);
        System.out.println(res);

    }

}
