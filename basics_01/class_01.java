package basics_01;
import java.util.Scanner;
public class class_01 {
     static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("hello world");
         System.out.println("enter a number ");
         double a= sc.nextDouble();
         double prod=1;
         for(int i=1;i<=a;i++){
             prod*=i;
         }
         System.out.println("the factorial of "+a+" is "+prod);
    }
}
