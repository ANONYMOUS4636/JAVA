package leetcode;

public class leetcode443 {
    static void main() {
        char[] chars={'a','b','c'};
        int left = 0;
        StringBuilder sb=new StringBuilder();
        for (int right = 0; right < chars.length; right++) {

            if(chars[left]!=chars[right]){
                sb.append(chars[left]);
                if((right-left)!=1){
                    sb.append(right-left);
                }

                left=right;
            }
            if(right==chars.length-1){
                sb.append(chars[left]);
                if((right-left)+1!=1){
                    sb.append(right-left+1);
                }
            }
            System.out.println(sb);
        }

    }
}
