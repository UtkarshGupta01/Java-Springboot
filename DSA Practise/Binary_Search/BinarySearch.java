package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,7,9,12,34,35,98,101,121};
        int start = 0;
        int end = arr.length-1;
        int target = 98;

        int ans = searchIndex(arr, start,end,target);
        System.out.println("Target is at the index : "+ans);

    }

    private static int searchIndex(int[] arr, int start, int end, int target) {
        while(start<=end){
        int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid-1;
            } else if (target> arr[mid]) {
                start = mid+1;
            }else {
                return mid;
            }
        }
    return -1;
    }
}
