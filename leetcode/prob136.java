package leetcode;

public class prob136 {
    static void main() {
        int res=0;
        int[] arr={4,1,2,1,2};
        for(int i=0;i<arr.length;i++) {
            res=res^arr[i];
        }
        System.out.println(res);
    }
}
