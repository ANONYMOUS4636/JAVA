package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class subsequenceString {
    static void main() {
        String s="abc";
        List<String> arr=new ArrayList<>();
        set(s,"",0,arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
    public static void set(String str,String ans,int ind,List<String> arr){
        if(ind>=str.length()) {
            arr.add(ans);
            return;
        }
        char ch=str.charAt(ind);
        set(str,ans+ch,ind+1,arr);
        set(str,ans,ind+1,arr);

    }
}
