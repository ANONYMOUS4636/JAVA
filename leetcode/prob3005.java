package leetcode;

public class prob3005 {
    static void main() {
        int nums[]={1,2,2,3,1,4};
        int flag=0;

        for(int i=0;i<=nums.length-1;i++){
            if(nums.length-1 == i){
                i=0;
                continue;
            }
            if(flag==nums.length-1) break;


        }
    }
}


//class Solution {
//    public int maxFrequencyElements(int[] nums) {
//        int count=0;
//        int real=0;
//        int flag=0;
//        for(int i=0;i<=nums.length-1;i++){
//            count=0;
//            for(int j=0;j<=nums.length-1;j++){
//                if(i==j) continue;
//                if(nums[i]==nums[j]) count++;
//            }
//            if(count>real){
//                real=count;
//                continue;
//            }
//            if(count==real){
//                flag++;
//            }
//        }
//        // int ans=nums.length-(count/2);
//        // if(count!=0) return count;
//        // else return nums.length;
//        return flag;
//    }
//}


//class Solution {
//    public int maxFrequencyElements(int[] nums) {
//        if(nums.length<=1) return nums.length;
//        byte[] freq=new byte[101];
//        int freqNum=0;
//        int maxFreq=0;
//        for(int elem:nums){
//            if(++freq[elem]==maxFreq){
//                freqNum++;
//            }
//            else if(freq[elem]>maxFreq){
//                maxFreq=freq[elem];
//                freqNum=1;
//            }
//        }
//        return freqNum*maxFreq;
//    }
//}