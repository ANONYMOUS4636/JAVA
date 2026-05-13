package leetcode;

public class gfg_practice02 {
    static void main() {
        int arr[]={1, 2, 2, 3, 3};
        if(arr.length==1) System.out.println(arr[0]);
        else if(arr[0]!=arr[1]) System.out.println(arr[1]);
        else if(arr[arr.length-1]!=arr[arr.length-2]) System.out.println(arr[arr.length-1]);
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==arr[mid+1]){
                if((mid+1)%2==0) high=mid-1;
                else low=mid+1;
            }
            else if(arr[mid]==arr[mid-1]){
                if(mid%2==0) high=mid-1;
                else low=mid+1;
            }
            else{
                break;
            }
        }
        System.out.println(arr[mid]);
    }
}
