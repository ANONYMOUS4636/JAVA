package array;

public class secondLargestElement {
    public static void main() {
        int[] arr={1,25,45,68,36,89,78,58,12};
        int max=arr[0];

        for (int j : arr) {
            if (max < j) max = j;

        }
        int max2=arr[0];

        for (int j : arr) {
            if (j == max) continue;
            if (max2 < j) max2 = j;
        }

        System.out.println("largest element is "+max);
        System.out.println("second largest element is "+max2);
    }
}
