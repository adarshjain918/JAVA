//  p   rime number
// Which are the prime numbers?
//A prime number is a whole number greater than 1 whose only factors are 1 and itself. A factor is a whole number that can be divided evenly into another number. The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29. Numbers that have more than two factors are called composite numbers.
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n1,n2,i,j;
        System.out.println("Enter two Number");
        Scanner sc = new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();

        for (i =n1;i<=n2;i++){
            for (j=2;j<=i;j++){

                if (i%j==00)
                    break;

            }
            if(i==j)
                System.out.println(j);
        }

    }
}
//
//Enter two Number
//        10
//        20
//        11
//        13
//        17
//        19