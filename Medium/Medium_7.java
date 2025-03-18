package Leetcode_series.Medium;
class Solution7{
    public int reverse(int x){
        int start = -1*(int)Math.pow(2,31);
        int last = (int)Math.pow(2,31)-1;
        int rev=0;
        while (x != 0) {
            int r = x % 10;
            
            
            if (rev > last / 10 || (rev == last / 10 && r > 7)) return 0; 
            if (rev < start / 10 || (rev == start / 10 && r < -8)) return 0; 

            rev = rev * 10 + r;
            x /= 10;
        }
        return rev;
    }
}
class Medium7{
    public static void main(String[] args) {
        Solution7 s = new Solution7();
        s.reverse(1534236469);
        System.out.println(s.reverse(1534236469)); 
    }
}