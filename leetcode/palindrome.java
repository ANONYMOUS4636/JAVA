package leetcode;

public class palindrome {
    static void main() {
        int x=-123;
        int check=x;
        int sum=0;
        while(x!=0){
            sum=(sum*10)+(x%10);
            System.out.println("sum is "+sum);
            x=x/10;
            System.out.println("x is "+x);
        }
        System.out.println(sum);

    }
}
