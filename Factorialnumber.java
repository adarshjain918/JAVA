// 6! = 6*5*4*3*2*1*!
//5! = 5*4*3*2*1*!
// n! = n*(n-1)*(n-2)*(n-3)*___* !

import java.util.Scanner;

public class Factorialnumber {
    public static void main(String[] args) {
        int n ; int fact =1 ;
        System.out.println("Enter element ");
        Scanner r = new Scanner(System.in);
        n=r.nextInt();
          for (int i =1;i<=n;i++) {

              fact = fact * i;
          }
        System.out.println(fact);
    }
}
