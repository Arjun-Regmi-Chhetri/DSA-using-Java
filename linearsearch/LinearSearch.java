package linearsearch;

import java.util.Scanner;

public class LinearSearch {

    int input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();

        return num;
    }
    int linearSearch(int[] arr){
        int n = arr.length;

       int num = input();

        for(int i = 0; i < n; i++){
            if(arr[i] == num){
                return i;
            }
        }

        return  -1;
    }

}
