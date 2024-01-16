package binarysearch;

public class BinarySearch {




    int binarySearch(int[] arr, int start, int end, int num){



        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if ( num < arr[mid] ) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }

        }

        return -1;
    }

}
