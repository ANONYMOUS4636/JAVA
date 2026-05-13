package search;

public class binarySearch {
    static void main() {
        int[] arr={-2,0,2,2,5,6,7,7};
//        int[] arr={-7,7,6,5,2,2,0,-2};
        int target=-2;
        int low=0;
        int high=arr.length-1;
        int mid;
        int count=0;
        while(low<=high){
            mid=(high+low)/2;
            if(arr[mid]<target){
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else if(arr[mid]==target){
                System.out.println("found");
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("not found");
        }
    }
}
