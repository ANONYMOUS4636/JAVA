package leetcode;

public class prob58 {
    static void main() {
        String s="   fly me   to   the moon  ";
        int pos=0;


        for(int i=s.length()-1;i>=0;i--){
            System.out.println(s.charAt(i)==' ');
            if(s.charAt(i)==' ' && Character.isLetter(s.charAt(i-1))){
                pos=i-1;

                break;
            }
        }

        int firstPos=s.lastIndexOf(' ',pos);
        System.out.println(s.charAt(pos));


    }
}


//Java compiler thinks:
//
//        👉 What if the if condition never becomes true?
//        👉 Then pos will never get a value.
//👉 But you are printing pos outside the loop.
//
//So Java says:
//
//        ❌ “pos might not have been initialized”
