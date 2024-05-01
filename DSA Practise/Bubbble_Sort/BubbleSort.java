package Bubbble_Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {34,231,2,65,12,7,98,12};
        bubbleSort(arr);
        System.out.print("Sorted Array : ");
        for(Integer i : arr){
            System.out.print(i+" ");
        }
    }
    private static void bubbleSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            for(int j = 0; j< arr.length-i;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
