package leetcode;

public class prob852 {
    static void main() {
       int arr[]={0,1,0};
                int low=0;
                int high=arr.length-1;
                int mid=-1;
                while(low<=high){
                    mid=(low+high)/2;
                    if(arr[mid]<arr[mid-1]) high=mid-1;
                    if(arr[mid]<arr[mid+1]) low=mid+1;
                    if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                        System.out.println(mid);
                        break;
                    }
                }



    }
}
