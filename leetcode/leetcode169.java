package leetcode;

import java.util.Arrays;

public class leetcode169 {
    static void main() {
        int[] nums={2,2,1,1,1,2,2};
        Arrays.sort(nums);
//        for(int ele:nums){
//            System.out.print(ele);
//        }
        int l=nums.length;
        int left=0;
        int right=0;
        while(left<=l-1){
            if(right<=l-1 && nums[left]==nums[right]){
                System.out.println("right is "+right);
                System.out.println("left is "+left);
                right++;
            }
            else{
                if((right-left)>l/2) {
                    System.out.println("right is "+right);
                    System.out.println("left is "+left);
                    System.out.println(nums[left]);
                    break;
                }
                else{
                    left=right;
                }
                if(left>=l) break;
            }

        }
    }
}
