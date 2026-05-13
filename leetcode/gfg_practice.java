package leetcode;

public class gfg_practice {
    static void main() {
        int[] arr={4,15, 17 , 17 , 19 , 20 , 21 , 22 , 22 , 25 , 26 , 26 , 26 , 28 , 28 , 28 , 31 , 31 , 32 , 33 , 34 , 34 , 35 , 36 , 36 , 37 , 38 ,38 ,39 , 41 ,41 ,42 ,43 ,43 ,44 ,44 ,45, 45,46, 47 ,49 ,49, 50, 50 ,50 ,51 ,53 ,54, 54 ,56 ,57 ,58 ,58 ,59 ,60 ,64 ,67, 69 ,75, 94};
        int n=arr.length;
        System.out.println("length is "+n);
        int mid=0;
        int x=26;
        int ans=-1;
        int high=arr.length-1;
        int low=0;
        while(low<=high){
            mid=(low+high)/2;
            System.out.println("mid is"+mid);

            if(arr[mid]>x) high=mid-1;
            else if(arr[mid]<x){
                ans=Math.max(ans,mid);
                low=mid+1;
            }
            else if(arr[mid]==x) {

                break;
            }
        }
        System.out.println(mid);
    }
}
