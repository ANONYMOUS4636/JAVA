package gfg;

public class unionofsortedarray {
}

//solution

//class Solution {
//    public static ArrayList<Integer> findUnion(int a[], int b[]) {
//        // code here
//        int x=0,y=0;
//        ArrayList<Integer> arr=new ArrayList<>();
//        while(x<a.length || y<b.length){
//            if(x + 1 < a.length && a[x] == a[x+1]) x++;
//            else if(y + 1 < b.length && b[y] == b[y+1]) y++;
//            else if(x>=a.length){
//                arr.add(b[y]);
//                y++;
//            }
//            else if(y>=b.length){
//                arr.add(a[x]);
//                x++;
//            }
//            else if(a[x]>b[y]){
//
//                arr.add(b[y]);
//
//                y++;
//            }
//            else if(a[x]<b[y]){
//                arr.add(a[x]);
//
//                x++;
//
//            }
//            else if(a[x]==b[y]){
//                arr.add(a[x]);
//                x++;
//                y++;
//            }
//            else if(x>=a.length){
//                arr.add(b[y]);
//                y++;
//            }
//            else if(y>=b.length){
//                arr.add(a[x]);
//                x++;
//            }
//
//        }
//
//        return arr;
//    }
//}

