class Solution1 {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                continue;
            }else{
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j] == 0 && nums[j+1]!=0){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    
                }
            }
        }
        return nums;           
    }
}
class March1{
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int nums[] = {847,847,0,0,0,399,416,416,879,879,206,206,206,272};
        s.applyOperations(nums);
        //847,847,0,0,0,399,416,416,879,879,206,206,206,272     
        //1694,399,832,1758,412,206,272,0,0,0,0,0,0,0  
    }
}