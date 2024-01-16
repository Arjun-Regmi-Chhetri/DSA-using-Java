package insertionsort;

import java.util.Arrays;

public class InsertionSort {

    void insertSort(int[] arr){

        System.out.println("Arrays : "+ Arrays.toString(arr));

        int n = arr.length;

        for(int i =0; i < n-1; i++){
            int temp = arr[i+1];
            int j = i;

            while (j >= 0 && temp <= arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

}
