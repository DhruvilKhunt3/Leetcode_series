package Leetcode_series.March;
import java.util.Scanner;
class Solution2206 {
    public boolean divideArray(int[] nums) {
        for (int i = 1; i <= 500; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i)
                    count++;
            }
            if (count % 2 != 0)
                return false;
        }
        return true;
    }
}
class March_17 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        Solution2206 s = new Solution2206();
        s.divideArray(a);
    }
}