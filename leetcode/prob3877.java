package leetcode;

public class prob3877 {
    static void main() {
        int[] arr={7};
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=res^arr[i];
    }
        System.out.println(res^arr[0]);

    }
}
