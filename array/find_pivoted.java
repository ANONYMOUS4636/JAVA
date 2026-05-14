package array;

public class find_pivoted {
    static void main() {
        int[] arr={4,5,6,7,0,1,2};
        int lo=0;
        int hi=arr.length-1;
        int mid=0;
        while(lo<hi){
            mid=lo + (hi - lo) / 2;
            if(arr[mid]>arr[hi]) lo=mid+1;
            else if(arr[mid]<arr[hi]) hi=mid;
        }
        int pi=lo;
        System.out.println(pi);
    }
}
