package sorting;

public class mergeSort {
    static void main() {
        int[] arr={5,4,9,8,7,2,4,6,3,1};
        mergesort(arr);
        for(int ele:arr) System.out.print(ele+" ");
    }

    private static void mergesort(int[] arr) {
        int n=arr.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        int idx=0;
        for(int i=0;i<a.length;i++) a[i]=arr[idx++];
        for(int i=0;i<b.length;i++) b[i]=arr[idx++];
        mergesort(a);
        mergesort(b);
        merge(a,b,arr);
    }

    private static void merge(int[] a, int[] b, int[] arr) {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                arr[k++]=b[j++];
            }
            else{
                arr[k++]=a[i++];
            }
        }
        while(i<a.length)arr[k++]=a[i++];
        while(j<b.length)arr[k++]=b[j++];
    }

}
