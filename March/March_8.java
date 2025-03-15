package Leetcode_series.March;
import java.util.*;
class solutionM8 {
    char colour[];
    solutionM8(String block){
        colour = new char[block.length()];
    }
    public int minimumRecolors(String blocks, int k) {
        for(int i=0;i<blocks.length();i++){
            char l = blocks.charAt(i);
            colour[i]=l;
        }
        int x[]= new int[blocks.length()];
        int total=0;
        boolean not = false;
        for(int i=0;i<colour.length;i++){
            if(colour[i]=='B'){
                x[i]=i;
            }
        }
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
        for(int i=0;i<x.length;i++){
            if(i+1==x.length){
                break;
            }
            if(x[i]==0){
                continue;
            }
            if(x[i+1] - x[i] == 1){
                total++;
            }
        }
        System.out.println("START -> "+total);
        if(total==k){
            not = true;
            return total;
        }
        int last=0;
        if(not){
            for(int i=0;i<colour.length;i++){
                if(colour[i]!='B'){
                    colour[i]='B';
                    last++;
                }
                if(last==k){
                    break;
                }
            }
        }
        return last;       
    }
}
class march8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter color (B & W only) -> ");
        String blocks = sc.nextLine().toUpperCase();
        System.out.print("Enter a target -> ");
        int k = sc.nextInt();
        solutionM8 s = new solutionM8(blocks);
        int ans = s.minimumRecolors(blocks, k);
        System.out.println(ans);
    }
}
