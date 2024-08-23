import java.util.*;
class searchinginrang {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[] a = {11, 23, 45, 78, 90, 22, 76, 99};
        System.out.println("Given array is :-");
        for (int i = 0; i < a.length; i++)
          System.out.print(a[i] + " ");
        System.out.println();
        System.out.println("Which element you what to find and also tell about range of element found? ");
        int key = x.nextInt();
        int start =x.nextInt();
        int end =x.nextInt();
        int result = linearsearch(a, key ,start,end);
        if(result==-1)
        System.out.println("Element not found in array");
        else
        System.out.println("Element found at index :- "+result); 
      }
      static int linearsearch(int[] arr, int target ,int start,int end) {
        if (arr.length == 0) {
          return -1;
        }
        for (int i = start; i <= end; i++) {
          int element = arr[i];
          {
            if (target == element)
              return i;
          }
          
        }
        return -1;
      }
}