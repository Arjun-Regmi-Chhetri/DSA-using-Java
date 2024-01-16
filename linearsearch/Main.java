package linearsearch;

public class Main {
    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int[] arr = {3,7,1,9,4};
        int result = ls.linearSearch(arr);
        if(result != -1){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
