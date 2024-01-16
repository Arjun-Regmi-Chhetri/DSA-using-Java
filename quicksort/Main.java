package quicksort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] arr = {42,84,75,20,90,5,30};
        int n = arr.length;
        qs.quickSort(arr,0,n-1);
        //qs.printArray(arr,n);

        System.out.println(Arrays.toString(arr));
    }


}
