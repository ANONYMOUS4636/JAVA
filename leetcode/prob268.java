package leetcode;

public class prob268 {
    static void main() {


        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int n = nums.length;
        int sum2 = (n*(n+1)) / 2;
        System.out.println(sum2);
        int sum = 0;
        for (int i = 0; i <= n - 1; i++) {
            sum += nums[i];
        }
        System.out.println(sum);

        System.out.println(sum2-sum);
    }
}
