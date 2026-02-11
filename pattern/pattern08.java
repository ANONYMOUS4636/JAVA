package pattern;

public class pattern08 {
    static void main() {
        for (int i=1;i<=5;i++) {
            for (int j=1;j<=i;j++){
                if((i+j)%2!=0)   System.out.print("0");
                else System.out.print("1");
            }
            System.out.println();
        }
    }
}
