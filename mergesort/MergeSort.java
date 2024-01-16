package mergesort;

class MergeSort{


    void merge(int[] arr, int start, int mid, int end){

        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];


        for(int i = 0; i < n1; i++){
            leftArray[i] = arr[start + i];
        }

        for(int j = 0; j < n2; j++){
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = start;




        while(i < n1 && j < n2){

            if(leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;

            }else{
                arr[k] = rightArray[j];
                 j++;

            }
             k++;
        }

        while(i < n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }


    }
    void mergeSort(int[] arr, int start, int end){
        if(start < end){

            int mid = start + (end - start) /2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);

        }
    }
    void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}