import java.util.*;

class BinarySearch01 {
  static void binary(int arr[], int target) {
    int start = 0;
    int last = arr.length - 1;
    
    while (start <= last) {
      int mid = start + (last - start) / 2;
      if (arr[mid] == target) {
        System.out.println("Target is found at index " + mid);
        return; // Return after finding the target
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        last = mid - 1;
      }
    }
    System.out.println("Target not found in the array");
  }

  public static void main(String[] args) {
    int arr[] = {2, 3, 4, 5, 6, 7, 8, 9};
    int target = 5;
    binary(arr, target);
  }
}
