package pattern;

public class pattern07 {
    static void main() {
        int count=1;
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
