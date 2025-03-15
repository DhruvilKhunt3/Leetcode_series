package Leetcode_series.Easy;
import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        int n1=x;
        int rev=0;
        int r=0;
        while(x>0){
            r=x%10;
            rev = (rev*10)+r;
            x/=10;
        }
        return n1==rev;
    }
}
class Number{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num --> ");
        int n = sc.nextInt();
        Solution s = new Solution();
        System.out.println("given num is palindrome: "+s.isPalindrome(n));
    }
}