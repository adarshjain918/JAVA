//  Count the number of digits
//any no  int n = 34424357;  how many digit are in this numbers  --->
// int counnt =0;

public class NumberOfDigits {
    public static void main(String[] args) {
        int n = 987654321;
        int count =0;
        while ( n> 0){
            n=n/10;
            count =count+1;
        }
        System.out.println(count);
    }

}
// ------>>>> 9