// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
// Given an array of integers nums sorted in non-decreasing order, find the
// starting and ending position of a given target value. If target is not found
// in the array, return [-1, -1]. You must write an algorithm with O(log n)
// runtime complexity.
import java.util.Arrays;

public class firstAndlastindex {
    public static int[] search(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums == null || nums.length == 0) {
            return result;
        }

        int start = 0, end = nums.length - 1;
        // Find the first index
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result[0] = mid;
                end = mid - 1;  // Continue searching in the left half
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        start = 0;
        end = nums.length - 1;
        // Find the last index
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result[1] = mid;
                start = mid + 1;  // Continue searching in the right half
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = search(nums, target);
        System.out.println(Arrays.toString(ans)); // Print the result as an array
    }
}
