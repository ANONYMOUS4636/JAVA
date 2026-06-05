package leetcode;

public class gfg04 {
    static void main() {
        String s = " i like this program very much ";
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        while(i<s.length()){
            while(i<s.length() && s.charAt(i)==' '){
                i++;
            }
            if(i>=s.length()) break;
            j=i;
            while(i<s.length() && s.charAt(i)!=' '){
                i++;
            }
            sb.append(" ");
            sb.append(swap(s.substring(j,i).toCharArray(),j,i-1));
        }
        System.out.println(sb.toString().trim());
    }
    public static String swap(char[] arr,int i,int j){
        while(j>i){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return String.valueOf(arr);
    }

    }


