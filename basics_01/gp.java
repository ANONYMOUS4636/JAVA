    package basics_01;

    import java.util.Scanner;

    public class gp {
        static void main() {
            int n,p=1;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the terms");
            n=sc.nextInt();
            for(int i=1;i<=n;i++){
                System.out.println(p);
                p*=2;
            }
        }
    }
