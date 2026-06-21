package Recursion;

import java.util.Scanner;

public class print1TOn {
    static int x;
    static void main() {
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        print1(1);
    }
    static void print1(int n){
        if(n>x) return;
        System.out.println(n);
        print1(n+1);
    }
}
