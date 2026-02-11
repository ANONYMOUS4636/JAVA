package pattern;

public class pattern04 {
    static void main() {
        for(int i=1;i<=5;i++){
            for (int j=1;j<=7;j++){
                if(i==1 || i==5){
                    System.out.print("* ");
                }
                else{
                    if(j==1 || j==7){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
