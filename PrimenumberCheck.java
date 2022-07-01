import java.util.Scanner;

public class PrimenumberCheck {
    public static void main(String[] args) {
        int n;
        boolean prime = true;
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        for (int i =1;i<n;i++){
            if (n%i==0)
                prime=false;
            break;
        }
        System.out.println("prime number ");
    }
}
