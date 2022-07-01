import java.util.Scanner;
public class IfelseQuestion {
    // given an integer n, perform following condition oprarters
// If n odd -> permit GOOD
// If n is Even and in the indi range 2 to 5 -. print Not Good
// if n is even and is not indictinmd range to 6 to 20--> prnt GOOD
// if n is even and greaterthen 20 -> print "Not Good"
//

        public static void main(String[] args) {
            int n;
            // TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if(n%2==1) // oddd number
            {
                System.out.print("GOOD");
            }

            else  if (n>=2 && n<=5)
                System.out.println("Not Good ");

            else if(n>= 6 && n<=20)
                System.out.println("good ");
            else if (n>20)
                System.out.println("not good ");
        }


    }


