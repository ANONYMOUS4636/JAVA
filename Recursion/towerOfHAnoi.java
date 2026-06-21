package Recursion;

public class towerOfHAnoi {
    static void main() {
        tower(5,'A','B','C');
    }

    private static void tower(int n, char a, char b, char c) {
        if(n==0)return;
        tower(n-1,a,c,b);
        System.out.println(a+"->"+c);
        tower(n-1,b,a,c);
    }
}
