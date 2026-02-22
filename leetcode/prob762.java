package leetcode;

public class prob762 {
    static void main() {
        int left=6;
        int right=10;
        int a=3;
        int count=0;
        int prime;
        int ans=0;
        for(int i=left;i<=right;i++){
            System.out.println("number is"+i);
            String s = Integer.toString(i, 2);
            System.out.println("binary is"+s);
            count=0;
            for(int j=0;j<=s.length()-1;j++){
                if(s.charAt(j)=='1') count++;
            }
            System.out.println("count is "+count);
            prime=0;
            for(int k=1;k<=(count/2);k++){
                System.out.println("count is "+count);
                System.out.println("k is "+k);
                if(count%k==0) prime++;
            }
                System.out.println("prime is "+prime);
            if(prime==1) ans++;
        }
        System.out.println(ans);
    }
}
