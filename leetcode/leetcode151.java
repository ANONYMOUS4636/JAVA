package leetcode;

import java.util.Arrays;

public class leetcode151 {
    static void main() {
        String s="a good   example";
        char[] arr=new char[s.length()];
        Arrays.fill(arr, ' ');
        int count=0;
        int j=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                count++;
                if(count==1){
                    arr[j++]=s.charAt(i);
                }
            }
            else{
                arr[j++]=s.charAt(i);
                count=0;
            }
        }
        int left = 0;
        for (int right = 0; right < s.length(); right++){
            if(arr[right]==' '){
                swap(arr,left,right-1);
                left=right+1;
            }
        }

        swap(arr,left,arr.length-1);
        for(char ele:arr){
            System.out.print(ele);
        }
//        System.out.println(String.valueOf(arr).trim());
    }
    public static void swap(char[] arr,int i,int j){
        while(j>i){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
