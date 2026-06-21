package Recursion;

public class reverseOfNumber {
    static void main() {
        System.out.println( printDigitSum(1234,0));
    }
//    public static void printDigitSum(int num, int sum) {
//        // 1. Add the last digit to our running sum
//        sum =(sum*10)+(num % 10);
//
//        // 2. Base Case: If no digits are left after stripping this one, print and stop
//        if (num / 10 == 0) {
//            System.out.println(sum);
//            return;
//        }
//
//        // 3. Recursive Call with the remaining digits and the updated sum
//        printDigitSum(num / 10, sum);
//    }
    public static int printDigitSum(int num, int sum) {
        if(num==0){
            return sum;
        }
        return printDigitSum(num/10,sum*10+num%10);
    }
}
