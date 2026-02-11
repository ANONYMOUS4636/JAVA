package basics_01;

import java.util.Scanner;

public class power {
    static void main() {
        int a,b,p=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base");
        a=sc.nextInt();
        System.out.println("enter power");
        b=sc.nextInt();
        for(int i=1;i<=b;i++){
            p*=a;
        }
        System.out.println(p);
    }
}
