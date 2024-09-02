import java.util.*;
public class HCF {
    public static int hcf(int num1, int num2) {
        int hcf = 1;
        for (int i = 2; i <= Math.min(num1, num2); i++) {
            while (num1 % i == 0 && num2 % i == 0) {
                hcf *= i;
                num1 /= i;
                num2 /= i;
            }
        }
        return hcf;
    }

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 45;
        System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf(num1, num2));
    }
}