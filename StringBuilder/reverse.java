package StringBuilder;

public class reverse {
    static void main() {
        String s="dattatraya";
        StringBuilder sb=new StringBuilder(s);
        //method 1
        sb.reverse();
        System.out.println(sb);
        //method2
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        System.out.println(sb);

    }
}
