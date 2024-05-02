package Insertion_Sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2,-21,-1212};
        insertionSort(arr);
        System.out.println("Sorted Array : ");
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
    private static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;

        }
    }
}
