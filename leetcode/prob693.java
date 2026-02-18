package leetcode;

public class prob693 {
    static void main() {
        int n=7;
        String str=Integer.toString(n,2);
        System.out.println(str);
        int count=0;
        for(int i=0;i<=str.length()-2;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                continue;
            }
            else{
                count++;
                break;
            }
        }
        if(count>0) System.out.println(false);
        else System.out.println(true);
    }
}
