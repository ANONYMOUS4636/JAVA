package pattern;

public class pattern02 {
    static void main() {
        for(char j='A';j<='E';j++){
            for(int i=1;i<=5;i++){
                if(j%2!=0){
                    char x=(char)(j+32);
                    System.out.print(x);
                }
                else{
                    System.out.print(j);
                }

            }
            System.out.println();
        }
    }
}
