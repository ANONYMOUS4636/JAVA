package leetcode;

public class prob3392 {
    static void main() {
        int nums[]={1,2,1,4,1};
        int count=0;
        for(int i=0;i<=nums.length-3;i++){
            for(int j=0;j<=nums.length-2;j++){
                if(i==j) continue;
                if(j<i) continue;
                double in=nums[i]+nums[j+1];
                double pe=(nums[j]/2.0);

                if(in==pe) {
                    System.out.println(i);
                    System.out.println(j);
                    System.out.println(in);
                    System.out.println(pe);
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
