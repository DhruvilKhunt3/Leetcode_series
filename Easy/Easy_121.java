package Leetcode_series.Easy;
class Solution121 {
    public int maxProfit(int[] prices) {
        int min = prices[0]; 
        int maxProfit = 0;      
        for (int i = 1; i < prices.length; i++) {  
            min = Math.min(min , prices[i]);
            maxProfit = Math.max(maxProfit , prices[i] - min);
        }
        return maxProfit;
    }
}
class Easy121 {
    public static void main(String[] args) {
        Solution121 s = new Solution121();
        int arr[] = {7,1,5,3,6,4};
        s.maxProfit(arr);
        System.out.println("-> " + s.maxProfit(arr));
    }
}