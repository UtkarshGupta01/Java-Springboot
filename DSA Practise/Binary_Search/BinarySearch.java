package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,7,9,12,34,35,98,101,121};
        int start = 0;
        int end = arr.length-1;

//        int ceilingTarget = 65;
//        int ans1 = ceilingSearch(arr,start,end,ceilingTarget);
//        System.out.println("Ceiling number for target : "+ans1);

        int floorTarget = 15;
        int ans2 = floorSearch(arr,start,end,floorTarget);
        System.out.println("Floor number for target : "+ans2);


//        int target = 98;
//        int ans = searchIndex(arr, start,end,target);
//        System.out.println("Target is at the index : "+ans);

    }

    private static int floorSearch(int[] arr, int start, int end, int floorTarget) {
        int floorNumber = 0;
        while(start<=end){
            int mid= start + (end - start)/2;
            if (arr[mid]>floorTarget){
                end = mid-1;
            } else if (arr[mid]<=floorTarget) {
                floorNumber = arr[mid];
                start = mid+1;
            }else {
                floorNumber = arr[mid];
            }
        }
        return floorNumber;
    }

    private static int ceilingSearch(int[] arr, int start, int end, int ceilingTarget) {
        int ceilingNumber = 0;
        while(start<=end){
            int mid= start + (end - start)/2;
            if (ceilingTarget<=arr[mid]){
                ceilingNumber = arr[mid];
                end = mid -1;
            } else if (ceilingTarget>arr[mid]) {
                start = mid +1;
            }else {
                ceilingNumber = arr[mid];
            }
        }
        return ceilingNumber;
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
