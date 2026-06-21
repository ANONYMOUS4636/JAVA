package Recursion;

public class preInPost {
    static void main() {
        pip(3);
    }

    private static void pip(int n) {
        if(n==0) return;
        System.out.print(n+" ");
        //pip(n-1);
        System.out.print(n+" ");
        //pip(n-1);
        System.out.print(n+" ");
    }
}
