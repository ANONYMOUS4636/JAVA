package leetcode;

public class prob3498 {
    static void main() {
        String s="zaza";
        int count;
        int pos=0;
        int result=0;
        for(int i=0;i<=s.length()-1;i++){
            count=0;
            for(char n='a';n<='z';n++){

                if(s.charAt(i)==(n)){

                    pos=n-71-count;
                }
                count+=2;
            }

            result=result+(pos*(i+1));
        }
        System.out.println(result);
    }
}
