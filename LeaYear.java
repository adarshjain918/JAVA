// leeap year when tthee year id divival by 400  & 4 caalled
// when year div by 100 then it is not a leap yr

public class LeaYear {
    public static void main(String[] args) {
        int year =2020;
        if(year % 400 == 0)
            System.out.println("This is Leap Year ");
        else if(year%4==0)
            System.out.println("This is leap year");
       else if (year %100==0)
            System.out.println("This is not Leaap year ");
    }
}
