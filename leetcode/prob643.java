package leetcode;

public class prob643 {
    static void main() {
        int[] nums={1,12,-5,-6,50,3};
        int k=4;
        int[] arr=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            arr[i]=sum;
        }
        double max=(double)(arr[k-1])/k;
        System.out.println(max);
        for(int i=0;i<arr.length-k;i++){
            max=Math.max(max,(double)(arr[k+i]-arr[i])/k);
        }
        System.out.println(max);
    }
}
