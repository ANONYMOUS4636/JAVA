package array;

public class reverseArray {
    static void main() {
        String str="i have a flower";
        char[] arr= str.toCharArray();
        int i=0;
        int j=arr.length-1;
        char  temp;
        while(i<j){


                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            i++;
            j--;
        }

        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
