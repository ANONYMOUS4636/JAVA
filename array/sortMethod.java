package array;

import java.util.Arrays;

public class sortMethod {
    static void main() {
        int[] arr={2,0,2,1,1,0};
//        int[] arr={1,25,45,68,36,89,78,58,12};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for (int j : arr) {
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
