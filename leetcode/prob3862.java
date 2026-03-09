package leetcode;

public class prob3862 {
    static void main() {
//        int nums[]={640,554,476,593,856,216,674,464,352,67,52,65,574,92,518,309,870,373,618,144,630,640,599,424,268};
        int nums[]={423,550,506,935,141,513,605,515,76,521,176,542,724,444,298,235,15,900,966,57,430,217,138,737,618,693,698,234,898,276,148,358,803,574,88,890,203,418,493,384,178,95,189,690,290,89,11,925,70,17,15,188,23,844,133,851,935,798,402,362,243,707,642,929,56,788,499,860,571,516,32,481,219,107,428,109,942,945,58,134,955,484,15,202,726,469,577,250,726,341,791,203,468,658,982,919,991,835,78,906,785,883,136,978,530,15,781,799,29,606,150};
//        int nums[]={2,8,2,2,5};
        int num=-1;
        for(int i=0;i<=nums.length-1;i++){
            double sum=0,prod=1;
            for(int j=0;j<=nums.length-1;j++){
                if(i==j) continue;
                if(j<i){
                    sum+=nums[j];
                }
                if(j>i){
                    prod*=nums[j];
                }
            }
            System.out.println("i is "+i);
            System.out.println("sum is "+sum);
            System.out.println("product is "+prod);
            if(sum==prod) num=i;

        }
        System.out.println(num);
    }
}


//class Solution {
//    public int smallestBalancedIndex(int[] nums) {
//        int n=nums.length;
//        if(n==0) return -1;
//        double[] suffix = new double[n+1];
//        suffix[n]=1;
//        for(int i=n-1;i>=0;i--){
//            suffix[i]=suffix[i+1]*nums[i];
//        }
//        double leftSum=0;
//        double rightProd;
//        for(int i=0;i<=n-1;i++){
//            rightProd=suffix[i+1];
//            if(rightProd==leftSum) return i;
//            leftSum+=nums[i];
//
//        }
//        return -1;
//    }
//}
