package leetcode;

public class prob209 {
    static void main() {
        int[] nums={2,3,1,2,4,3};
        int target=7;
        int left=0;
        int sum=0;
        int count=0;
        int min=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            count++;
            while(sum>target){
                sum-=nums[left];
                count--;
                left++;
            }
            if(sum==target){
                System.out.println("sum is"+sum);
                System.out.println("count is"+count);
                if(min>count) min=count;
            }
        }
        System.out.println(min);
    }
}
