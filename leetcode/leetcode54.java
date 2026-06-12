package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode54 {
    static void main() {
        int[][] m={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> arr=new ArrayList<>();
        int fircol=0;
        int lastcol=m[0].length-1;
        int firrow=0;
        int lastrow=m.length-1;
        while(fircol<=lastcol && firrow<=lastrow){
            for(int i=fircol;i<=lastcol;i++){
                arr.add(m[firrow][i]);
            }
            firrow++;
            if(fircol>lastcol && firrow>lastrow) break;
            for(int i=firrow;i<=lastrow;i++){
                arr.add(m[i][lastcol]);
            }
            lastcol--;
            if(fircol>lastcol && firrow>lastrow) break;
            for(int i=lastcol;i>=fircol;i--){
                arr.add(m[lastrow][i]);
            }
            lastrow--;
            if(fircol>lastcol && firrow>lastrow) break;
            for(int i=lastrow;i>=firrow;i--){
                arr.add(m[i][fircol]);
            }
            fircol++;
            if(fircol>lastcol && firrow>lastrow) break;
        }
        System.out.println(arr);
    }
}
