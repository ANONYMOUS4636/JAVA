package leetcode;

public class prob189 {
    static void main(){
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        int n=nums.length;
        k=k%n;
        reverse(nums,0,k);
        reverse(nums,k+1,n-1);
        reverse(nums,0,n-1);

        for(int ele:nums){
            System.out.println(ele);
        }
    }
    public static void reverse(int[] arr,int i,int j){
        int temp;
        while(i<j){
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
    }
}
