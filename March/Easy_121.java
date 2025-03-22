class Solution121 {
    public int maxProfit(int[] prices) {
        int min = 0 ;
        int max = 0;
        if(prices.length==1){
            return 0;
        }
         for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                min = prices[i];
                for(int j=i;j<prices.length;j++){
                    if(prices[j]>max){
                        max = prices[j];
                    }
                }
                break;
            }
         }
         return max - min ;
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