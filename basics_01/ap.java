package basics_01;

import java.util.Scanner;

public class ap {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("enter a number");
        n=sc.nextInt();
        for(i=2;i<=(3*n-1);i+=3){
            System.out.println(i);
        }

        }
    }

