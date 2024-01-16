package mergesort;

public class Main {
    public static void main(String[] args) {
        int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };
        int n = a.length;
        MergeSort m1 = new MergeSort();
        System.out.println("\nBefore sorting array elements are - ");
        m1.printArray(a);
        m1.mergeSort(a, 0, n - 1);
        System.out.println("\nAfter sorting array elements are - ");
        m1.printArray(a);
        System.out.println("");
    }
}
