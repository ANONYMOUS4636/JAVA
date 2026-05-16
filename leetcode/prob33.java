class Solution {
    public int search(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>arr[low]){
                if(target>=arr[low] && target<arr[mid]) high=mid-1;
                else low=mid+1;
            }
            else if(arr[mid]<arr[high]){
                if(target<=arr[high] && target>arr[mid]) low=mid+1;
                else high=mid-1;
            }

            else low++;
        }
        return -1;
    }
}