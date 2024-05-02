package Selection_Sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2,-1};
        selectionSort(arr);
        System.out.println("Sorted Array : ");
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
    private static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j]<arr[smallest]){
                    smallest = j ;
                }
            }
            swap(arr,i,smallest);
        }
    }
    private static void swap(int[] arr, int i, int smallest) {
        int temp = 0;
        temp = arr[i];
        arr[i] = arr[smallest];
        arr[smallest] = temp;
    }

}
