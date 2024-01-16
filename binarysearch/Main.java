package binarysearch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BinarySearch bs = new BinarySearch();

        int[] arr = {2,5,8,9,6};
        int n = arr.length;

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int num = scan.nextInt();

        int result = bs.binarySearch(arr,0,n-1,num);

        if (result != -1) {
            System.out.println("Number found at index: " + result);
        } else {
            System.out.println("Number not found in the array");
        }

    }

}
