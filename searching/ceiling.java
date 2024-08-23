import java.util.*;

public class ceiling {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  //   int[] arr = {2, 4, 6, 8, 10, 12};
  //   int target = 7;
  //   int p = 0;

  //   for (int i = 0; i < arr.length; i++) {
  //     if (target == arr[i]) {
  //       p = arr[i];
  //       break;
  //     } else if (arr[i] > target) {
  //       p = arr[i];
  //       break;
  //     }
  //   }

  //   if (p != 0) {
  //     System.out.println(p);
  //   } else {
  //     System.out.println("Element is not found");
  //   }
        int []a={12,32,43,12,31,43,4};
      int b=(a.length);
      int c=sc.nextInt();
      for (int i =0;i<b;i++){
        if(a[i]==c){
          System.out.println(i);
        }
      }
   }
}