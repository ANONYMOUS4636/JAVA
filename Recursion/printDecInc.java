package Recursion;

public class printDecInc {
    static void main() {
        int n=5;
        print1(5);
    }
    static void print1(int n){
        System.out.println(n);
        if(n==0) return;
        print1(n-1);
        System.out.println(n);
    }
}
