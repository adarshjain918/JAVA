import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;
import com.sun.xml.internal.bind.util.Which;

// Reverse number
// n = 987
// take lsat digit out
// stone in some variver
// elemenet last digit from n
// lastdigit
//  987%10 = 7,
// reverse <-- lastdigit
// n/10 987/10 = 98
// again move
//  FORMULA --> reverse= reverse*10+lastDigit

public class FindaReverseNumber {
    public static void main(String[] args) {


        int n = 987, reverse = 0, LastDigit;
        while (n>0)
        {
            LastDigit = n%10;
            reverse =reverse*10+LastDigit;
            n=n/10;
        }
        System.out.println(reverse);

    }
}

// ---> 789