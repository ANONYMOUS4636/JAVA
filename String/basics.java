package String;

public class basics {
    static void main() {
        int l=24;
        int r=40;
        int k=9;
        int left=(int)Math.ceil(Math.pow(l,1.0/k));
        int right=(int)Math.round(Math.pow(r,1.0/k));
        System.out.println(left);
        System.out.println(right);
        System.out.println((right-left)+1);
    }
    }

