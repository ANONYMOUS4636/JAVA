package Recursion;

public class GlobalVariables {
    static int x = 10;
    public static void main(String[] args) {
        fun();
        x = 9; // change
        System.out.println(x);
        int x = 4; // local variable dec and ini
        System.out.println(x);
        x = 6;
        System.out.println(x);
    }
    public static void fun(){
        System.out.println(x);
        x = 20;
        System.out.println(x);
        int x = 6;
        System.out.println(x);
    }
}