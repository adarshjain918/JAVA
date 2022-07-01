// Fibonaci series
// f,s,t
// f=s;
// s=t;
// t=s+f
//
// 1,1,2,3,4,5.....


public class FibonacciSeries {
    public static void main(String[] args) {
        int f=1 ,s =1, t;
           int n=10;
        // int t = f+s;
        System.out.println(f);
        System.out.println(s);
        for (int i =3;i<=n;i++){
            t=s+f;
            System.out.println(t);
            f=s;
            s=t;
        }
    }
}
