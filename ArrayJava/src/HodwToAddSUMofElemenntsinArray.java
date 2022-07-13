import java.util.Scanner;

public class HodwToAddSUMofElemenntsinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sixe of array");
        int size = sc.nextInt(); int sum = 0;
        int array[] = new int[size];

        System.out.println("Enter array value ");
        for (int i=0;i<=size;i++){
            array[i]= sc.nextInt();
        }
        for (int i=0;i<= array.length;i++) {
            sum = sum + array[i];
        }
        System.out.println("sum"+sum);
    }
}
