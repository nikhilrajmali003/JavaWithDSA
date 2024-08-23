import java.util.Scanner;

public class string1 {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    String a = "nikhilrajmali";
    System.out.println("Given STRING is :-");

    System.out.println(a);
    System.out.println("Which alphabet element do you want to find? ");
    char n = x.nextLine().charAt(0);  // Read a character input
    int result = stringsearching(a, n);
    
    if (result == -1) {
      System.out.println("Element not found in array");
    } else {
      System.out.println("Element found at index :- " + result);
    }
  }

  static int stringsearching(String S, char n) {
    if (S.length() == 0) {
      return -1;
    }
    for (int i = 0; i < S.length(); i++) {
      if (n == S.charAt(i)) {
        return i;
      }
    }
    return -1;
  }
}
