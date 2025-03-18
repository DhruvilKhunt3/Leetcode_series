package Leetcode_series.Medium;
class Solution_Me15{
    public double myPow(double x, int n) {
        double result = 0;
        result = Math.pow(x,n);
        return result;
    }
}
class Medium50{
    public static void main(String[] args) {
        Solution_Me15 s = new Solution_Me15();
        double x = 2.10000;
        int n = 3;
        s.myPow(x, n);  
        System.out.println("-> "+s.myPow(x, n)); 
    }
}