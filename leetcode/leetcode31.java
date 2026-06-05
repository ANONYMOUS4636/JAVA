package leetcode;

public class leetcode31 {
    static void main() {
        int[] nums={3,2,1};
        int pivot=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                pivot=i-1;
                break;
            }
        }
        System.out.println(pivot);

        for (int i = nums.length - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                int pre = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = pre;
                System.out.println("inside");
                break;
            }
        }


        swap(nums,pivot+1,nums.length-1);

        for (int num : nums) {
            System.out.println(num);
        }
    }
    public static void swap(int[] nums,int i,int j){
        while(j>i){
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            i++;
            j--;
        }
    }
}
