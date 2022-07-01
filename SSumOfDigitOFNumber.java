// 437 -->. 4+3+7 =14;

public class SSumOfDigitOFNumber {
    public static void main(String[] args) {
        int n = 437;
        int  sum=0;
        while (n>0){
        int temp= n % 10;
        sum = sum + temp ;
         -n =n/10;
        }
        System.out.println(sum);

    }
}
