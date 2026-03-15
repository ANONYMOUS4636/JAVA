package leetcode;

public class prob75 {
}

//solution

//    class Solution {
//    public void sortColors(int[] nums) {
//        int first=0;
//        int mid=0;
//        int last=nums.length-1;
//
//        while(mid<=last){
//            if(nums[mid]==0){
//                swap(nums,mid,first);
//                first++;
//                mid++;
//            }
//            else if(nums[mid]==2)
//            {
//                swap(nums,mid,last);
//                last--;
//
//
//            }
//
//            else if(nums[mid]==1){
//                mid++;
//
//            }
//
//        }
//    }
//
//    public static void swap(int[] arr,int i,int j){
//        int temp;
//        temp=arr[j];
//        arr[j]=arr[i];
//        arr[i]=temp;
//    }
//}