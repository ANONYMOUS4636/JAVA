package leetcode;

public class prob283 {
    static void main() {
        int[] nums={0,1,0,3,12};

        int temp=0;
        for(int i=0;i<=nums.length-1;i++){
            for(int j=0;j<nums.length-1;j++){
             if(nums[j]==0){
                 temp=nums[j+1];
                 nums[j+1]=nums[j];
                 nums[j]=temp;
             }
            }
        }

        for(int i=0;i<=nums.length-1;i++){
            System.out.println(nums[i]);
        }
}}
