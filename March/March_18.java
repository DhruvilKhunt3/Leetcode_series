class Solution18 {
    public int longestNiceSubarray(int[] nums) {
        int left = 0, currentAnd = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            while ((currentAnd & nums[i]) != 0) {
                currentAnd -= nums[left];
                left++;
            }
            currentAnd += nums[i];
            if (i - left + 1 > count) {
                count = (i) - left + 1;
            }
        }
        return count;
    }
}

class March_18{
    public static void main(String[] args) {
        Solution18 solution = new Solution18();
        int arr[] = {1,3,8,48,10};
        System.out.println("->"+ solution.longestNiceSubarray(arr));
    }
}
