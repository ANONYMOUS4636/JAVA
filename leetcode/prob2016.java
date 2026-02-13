package leetcode;

import org.w3c.dom.ls.LSOutput;

public class prob2016 {
    static void main() {
        int nums[]={1,5,2,10};
        int min=nums[0];
        int result=0;
        int comp=0;
        int count=0;
        for(int i=0;i<=nums.length-1;i++){
            if(min>nums[i]){
                min=nums[i];
            }

            if(min>nums[i]){

                continue;
            }
            if(min<nums[i]){result=nums[i]-min;count++;}
            if(result>comp){
                comp=result;
            }




            // else if(min<nums[i+1]){
            //     result=nums[i+1]-min;
            // }
        }

        if(count==0) System.out.println(-1);
        else System.out.println(comp) ;
    }
}
