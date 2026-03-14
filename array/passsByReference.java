package array;

import java.util.Scanner;

public class passsByReference {
    public static void change(int[] x){
        x[2]=2;
    }
    static void main() {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arr[2]);
       change(arr);
        System.out.println(arr[2]);
    }
}
