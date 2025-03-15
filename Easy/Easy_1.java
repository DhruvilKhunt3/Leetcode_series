package Leetcode_series.Easy;
import java.util.*;
class Solution{
    int b,c;
    public int[] twoSum(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    if(i==j){
                        break;
                    }
                    b=i;
                    c=j;
                    return new int[]{b,c};
                }//end of if 
            }//end of for
        }//end of for
        return new int[]{b,c};
    }//end of output
}//end of class
class Execute{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array --> ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array's element");
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter array element ("+i+") --> ");
            arr[i] = sc.nextInt();
        }//end of for 
        System.out.print("Enter target --> ");
        int t = sc.nextInt();
        Solution s = new Solution();
        int x[]=(s.twoSum(arr,t));
        Arrays.sort(x);
        for(int i=0;i<2;i++){
            System.out.print(x[i]+",");
        }//end of for 
    }//end of psvm
}//end of class