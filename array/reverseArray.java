package array;

public class reverseArray {
    static void main() {
        int[] arr={6,10,2,9,3,8,7,16};
        int i=0;
        int j=arr.length-1;
        int  temp;
        while(i<j){


                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            i++;
            j--;
        }

        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
