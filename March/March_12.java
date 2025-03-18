 
import java.util.Scanner;
class Solution12{
    int positive;
    int negative;
    public int maximumCount(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] <0){
                negative++;
            }
            if(nums[i] >0){
                positive++;
            }if(nums[i]==0){
                continue;
            }
            
        }
        if(negative>positive){
            return negative;
        }
        return positive;
    }
}
class March12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int size = 0;
        System.out.println("Enter array element");
        System.out.println("Enter done if you want to stop");
        while(true){
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("done")){
                break;
            }
            int number = 0;
            boolean valid = true;
            for(int i = 0; i < input.length(); i++){
                char c = input.charAt(i);
                if(c < '0' || c > '9'){
                    valid = false;
                }
                number = number * 10 + (c - '0');
            }
            if(valid){
                if(size == arr.length){
                    int newarr[] = new int[arr.length + 10];
                    for(int i = 0; i < arr.length; i++){
                        newarr[i] = arr[i];
                    }
                    arr = newarr;
                }
                arr[size] = number;
                size++;
            }else{
                System.out.println("Please enter a valid number or 'done' if you want to stop");
            }
        }
        System.out.print("Array -> [");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i]);
            if(i < size - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        Solution12 leetcode = new Solution12();
        leetcode.maximumCount(arr);
    }
}