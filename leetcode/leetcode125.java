package leetcode;

public class leetcode125 {
    static void main() {
        String s="A man, a plan, a canal: Panama";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        String str1=sb.toString();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        String str2=sb.toString();
        if(str1.equals(str2)) System.out.println(true);
        else System.out.println(false);
    }
}
