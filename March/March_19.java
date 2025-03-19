class Solution_M19 {
    public int minOperations(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==0){
                if(nums[i]==0){
                    nums[i] =1;
                }else{
                    nums[i] =0;
                }
                if(nums[i+1]==0){
                    nums[i+1]=1;
                }else{
                    nums[i+1]=0;
                }
                if(nums[i+2]==0){
                    nums[i+2]=1;
                }else{
                    nums[i+2]=0;
                }
                count++;
            }else{
                continue;
            }
        }
        boolean valid = true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                valid = false;
                break;
            }
        }
        if(!valid){
            return -1;
        }
        return count;
    }
}
class March19{
    public static void main(String[] args) {
        Solution_M19 s = new Solution_M19();
        int arr[] = {0,1,1,1,0,0};
        s.minOperations(arr);

    }
}