import java.util.Scanner;
public class ReverseAnArray {
    public static void main(String args[]) {
        int n;
        int a[] = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of values in an array: n = ");
        n = s.nextInt();
        System.out.println("Enter the values of array: ");

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        for (int j = n - 1; j >= 0; j--) {
            System.out.println(a[j]);
        }
    }

}
