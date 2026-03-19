package leetcode;

public class prob88 {
    static void main() {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3,n=3;
        int[] arr=new int[m+n];
        int x=0,temp,y=0,z=0;
        if(m==0){
            for(int j=0;j<n;j++){
                nums1[j]=nums2[j];
            }
        }
        else if(n!=0 && m!=0){
            for(int i=0;i<m;i++){
                if(x>=m && y>=n) {
                    System.out.println("cond1");
                    break;
                }
                }
                if(nums1[x]>nums2[y]){
                    arr[z]=nums2[y];
                    y++;
                    z++;
                    System.out.println("cond2");
                }
                else if(nums1[x]==0 && x>=m){
                    arr[z]=nums2[y];
                    y++;
                    z++;
                    System.out.println("cond3");
                }
                else if(y>=n){
                    arr[z]=nums1[x];
                    x++;
                    z++;
                    System.out.println("cond4");
                }
                else if(nums1[x]<=nums2[y] && nums1[x]!=0){
                    arr[z]=nums1[x];
                    x++;
                    z++;
                    System.out.println("cond5");
                }

            for(int i=0;i<m;i++) {
                nums1[i] = arr[i];
            }
            }
        for(int i=0;i<m;i++){
            System.out.print(arr[i]+" ");
        }
        }
    }

