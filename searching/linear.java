//  Array element searching :-
import java.util.*;
public class linear {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    int[] a = {11, 23, 45, 78, 90, 22, 76, 99};
    System.out.println("Given array is :-");
    for (int i = 0; i < a.length; i++)
      System.out.print(a[i] + " ");
    System.out.println();
    System.out.println("Which element you what to find ? ");
    int n = x.nextInt();
    int result = linearsearch(a, n);
    if(result==-1)
    System.out.println("Element not found in array");
    else
    System.out.println("Element found at index :- "+result); 
  }
  static int linearsearch(int[] arr, int n) {
    if (arr.length == 0) {
      return -1;
    }
    for (int i = 0; i < arr.length; i++) {
      int element = arr[i];
      {
        if (n == element)
          return i;
      }
      
    }
    return -1;
  }
}