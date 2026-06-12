package leetcode;

public class leetcode74 {
    static void main() {
        int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=23;
        int m=mat[0].length;
        int n=mat.length;
        int high=n-1;
        int low=0;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target>mat[mid][0] && target<mat[mid][m-1]){
                ans=mid;
                break;
            }
            else if(target>mat[mid][m-1]) low=mid+1;
            else if(target<mat[mid][0]) high=mid-1;
        }
        if(ans==-1) System.out.println(false);
        low=0;
        high=m-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target==mat[ans][mid]){
                System.out.println(true);
                break;
            }
            else if(target<mat[ans][mid]) high=mid-1;
            else if(target>mat[ans][mid]) low=mid+1;
        }
        System.out.println(false);
    }
}
