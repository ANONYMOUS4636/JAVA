package sorting;

public class bubbleSort {
    static void main() {
        int heights[]={180,165,170};
        String names[]={"Mary","John","Emma"};
        int temp;
        String tem;
        for(int j=0;j<heights.length;j++){
            for(int i=0;i<heights.length-1;i++){
                if(heights[i]>heights[i+1]){
                    temp=heights[i];
                    heights[i]=heights[i+1];
                    heights[i+1]=temp;

                    tem=names[i];
                    names[i]=names[i+1];
                    names[i+1]=tem;
                }
            }
        }

//        System.out.println(heights[heights.length]);
        for(int i=0;i<heights.length;i++){
        System.out.println(heights[i]);
        System.out.println(names[i]);
        }
    }
}
