package leetcode;

public class prob283 {
    static void main() {
        int[] nums={0,1,0,3,12};
        int count=0;

        for(int i=0;i<=nums.length-1;i++){
           if(nums[i]!=0){
               nums[count]=nums[i];
               count++;
           }
        }




        for(int i=count;i<=nums.length-1;i++){
            nums[i]=0;
        }


        for(int i=0;i<=nums.length-1;i++){
            System.out.println(nums[i]);
        }
}}
