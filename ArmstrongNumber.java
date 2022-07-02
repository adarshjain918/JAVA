// Armstrong Number --> Sum of the cube of the digit of any
// number is equal to the number itself Amestrong number
//153 --> 1cube +5cube 3cube = 1+125+9 =>153
//370,371, 407,
//
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=407;
        double temp;
        double armstrong=0;
        double originail=n;

        while(n>0){
            temp = n%10;
            temp =Math.pow(temp,3);
            armstrong = armstrong+temp;
            n=n/10;
        }
        if (armstrong == originail)
        {
            System.out.println("armstrong number ");
        }
        else
        System.out.println("Not a number armstrong");

    }
}
