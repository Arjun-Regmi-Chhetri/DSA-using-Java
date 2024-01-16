package bubblesort;


import java.util.Arrays;

public class BubbleSort {

   public void bubbleSort(){
       int arr[] = {7,2,12,8,3};
       int n = arr.length;

       for(int i = 0; i<n; i++){
           for(int j =0; j < n-i-1 ;j++){
               if( arr[j] >  arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
       System.out.println(Arrays.toString(arr));
    }



}


