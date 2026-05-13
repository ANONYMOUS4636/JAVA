package search;

public class BSInDecrnding {
    static void main() {
        int[] arr={7,7,6,5,2,2,0,-2};
        int target=0;
        int low=arr.length;
        int high=0;
        int mid=0;
        while(low>=high){
            mid=(low+high)/2;
            if(target>arr[mid]){
                low=mid-1;
            }
            else if(target<arr[mid]){
                high=mid+1;
            }
            else if(target==arr[mid]){
                System.out.println("found");
                break;
            }
        }
    }
}
