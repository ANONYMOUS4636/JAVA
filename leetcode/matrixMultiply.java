package leetcode;

public class matrixMultiply {
    static void main() {
        int[][] A={{7, 8}, {2 , 9}};
        int[][] B={{14, 5}, {5, 18}};
        int[][] C=new int[A[0].length][B.length];

        multiply(A,B,C);

        for(int[] ele:C){
            for(int tar:ele){
                System.out.print(tar+" ");
            }
            System.out.println();
        }

    }
    public static void multiply(int A[][], int B[][], int C[][]) {
        int r=A[0].length-1;
        int c=B.length-1;
        int sum=0;
        for(int i=0;i<=r;i++){
            for(int j=0;j<=c;j++){
                for(int k=0;k<=r;k++){
                    sum+=A[i][k]*B[k][j];
                    C[i][j]=sum;
                }
                sum=0;
            }
        }
    }
}
