package pattern;

public class pattern03 {
    static void main() {
        char j;
        int k;
        for(int i=1;i<=5;i++){
            for(k=1,j='A';k<=i;k++,j++){
                if(i%2==0){
                    System.out.print(j);
                }
                else{
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}
