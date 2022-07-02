// check wheater a number is palidrom or not

//A palindromic number (also known as a numeral palindrome or a numeric palindrome) is a number (such as 16461) that remains the same when its digits are reversed. In other words, it has reflectional symmetry across a vertical axis.
// abcdef
// fedcbc
// abcdcba


public class Checkpalindrom {
    public static void main(String[] args) {
        String x = "abcdedcba" ;
        int i= 0; int j = x.length()-1;
        while (i<j){
            if (x.charAt(i)!= x.charAt(j)){
                System.out.println("this is not palindromic number" + x );
                //System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("Palondrom");

    }
}
