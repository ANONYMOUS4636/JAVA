package sorting;



public class selectionSort {
    static void main() {
        // selection sort

        int[] arr={5,-2,6,7,2,0,7,2};
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(arr,i,min);
        }
        print(arr);
  }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
