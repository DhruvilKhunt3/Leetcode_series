package Leetcode_series.Medium;
class Solution3 {
    public int lengthOfLongestSubstring(String s){
        String subString = "";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                subString = "";
                subString += s.charAt(i+1);
                i++;
            }else{
                subString += s.charAt(i);
            }
        }
        System.out.println(subString);
        return subString.length();       
    }
}
class Medium3{
    public static void main(String []args){
        Solution3 solution = new Solution3();
        String input = "abcabcbb";
        solution.lengthOfLongestSubstring(input);
    }
}