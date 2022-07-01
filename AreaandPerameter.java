import java.util.Scanner;

//
public class AreaandPerameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 =sc.nextInt();
        int s2 =sc.nextInt();
        int area =s1* s2;
        int perimeter = 2 * (s1+s2);
        System.out.println("Area "+ area);
        System.out.println("perimeter"+perimeter);
    }


}
// ----> 20
//30
//Area 600
//perimeter100