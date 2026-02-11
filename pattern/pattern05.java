package pattern;

public class pattern05 {
    static void main() {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==3){
                    System.out.print("* ");
                }
                else{
                    if(j==3){
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
