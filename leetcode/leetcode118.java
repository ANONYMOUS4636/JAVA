package leetcode;

import java.util.ArrayList;
import java.util.*;

import static java.lang.reflect.Array.get;

public class leetcode118 {
    static void main() {
        int n=5;
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<>(i+1));
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    arr.get(i).set(j,1);
                }
                else{
                    int a=arr.get(i-1).get(j)+arr.get(i-1).get(j-1);
                    arr.get(i).set(j,a);
                }
            }
        }
        System.out.println(arr);
    }
}
