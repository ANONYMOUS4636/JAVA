package basics_01;

import java.util.Scanner;

public class gpqs {
    static void main() {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        for(int i=1,j=n;j>0;i++,j-=1){
            System.out.println(i);
            System.out.println(j);
        }
    }
}
