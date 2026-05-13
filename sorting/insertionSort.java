package sorting;

public class insertionSort {
    static void main() {
        int[] arr={5,-2,6,7,2,0,7,2};
        int j;
        for(int i=1;i<arr.length;i++){
            j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
