//package pattern;
//
//public class pattern09 {
//    static void main() {
//        for(int i=0;i<=5;i++){
//            for(int j=5;j>=i;j--){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//    }
//}


package pattern;

public class pattern09 {
    static void main() {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
               if((i+j)>5) System.out.print("*");
               else System.out.print(" ");
            }

            System.out.println();

        }
    }
}


