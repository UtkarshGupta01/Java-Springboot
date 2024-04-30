package Linear_Search;

/**
 * LinearSearch
 */
public class LinearSearch {

  public static void main(String[] args) {
    int[] arr = {18,12,-17,2,3,14,28};

    int target = 3;
    int start = 1;
    int end = 6;

//    int ans = searchIndex(arr,target,start, end);
//    System.out.println("Target is present at the index : "+ans);

    int min = searchMin(arr);
    System.out.println("Minimum value in array : " + min);

  }

  public static int searchMin(int[] arr) {
    int min = arr[0];
    for(int i : arr){
      if(i<min){
        min = i;
      }
      else {
        continue;
      }
    }
    return min;

  }

  public static int searchIndex(int[] arr, int target, int start,int end) {
    for (int i = start;i<end;i++){
      if (arr[i]==target){
        return i;
      }
    }
    return -1;
  }
}