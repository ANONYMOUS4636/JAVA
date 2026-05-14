package leetcode;

public class gfg_practice03 {
    static void main() {
        int[] arr={5, 6, 7, 1, 2, 3, 4};
        int key=1;
        int pi=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                pi=i;
                break;
            }
        }
        int ans1=binary(arr,0,pi,key);
        int ans2=binary(arr,pi,arr.length-1,key);
        System.out.println(pi);
        System.out.println(ans1);
        System.out.println(ans2);


    }
    public static int  binary(int[] arr,int low,int high,int target){
        // int mid=0;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]<target){
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else if(arr[mid]==target){
                return mid;
            }
        }
        return -1;
    }
    }


