package leetcode;

public class prob3842 {
    static void main() {
        int a[]={20,10,30,10};
        int b[]=new int[5];
        int count=0;
        int pos=0,pos2=0;
        for(int i=0;;i++){
            if(i==count){
                continue;
            }
            if(a[count]==a[i]){
                pos=i;
                pos2=count;
            }
            if(i==(a.length-1)){
                count++;
                i=0;
            }
            if(count==(a.length-1)){
                break;
            }
        }

        System.out.println(pos+" "+pos2);

        for(int i=0;i<a.length-1;i++){
            if(i!=pos && i!=pos2){
                b[i]=a[i];
            }
        }

        for(int i=0;i<=b.length-1;i++){
            System.out.println(b[i]);
        }

    }
}

//int ans[] = new int[bulbs.length];  // ERROR: bulbs cannot be resolved
