package basics_01;

import java.util.Scanner;

public class ap_dec {
    static void main() {
        int tn;

        Scanner sc=new Scanner(System.in);
        for(int i=1;i>0;i++){
            tn=99+(i-1)*-4;
            if(tn<0){
                break;
            }
            System.out.println(tn);
        }
    }
}
