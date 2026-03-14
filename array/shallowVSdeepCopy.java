package array;

import java.util.Arrays;

public class shallowVSdeepCopy {
    static void main() {
        int[] arr={1,25,45,68,36,89,78,58,12};
        int[] x=arr; //shallow copy
        System.out.println(arr[2]);
        System.out.println(x[2]);
        x[2]=5;
        System.out.println(arr[2]);
        System.out.println(x[2]);

        int[] y= Arrays.copyOf(arr,arr.length); //deep copy
        y[2]=10;
        System.out.println(arr[2]);
        System.out.println(y[2]);
    }
}
