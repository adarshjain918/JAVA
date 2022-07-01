//


import java.util.Scanner;

public class TakingInputANDPrinting {

        public static void main(String[] args)
        {
            Scanner in =  new Scanner(System.in);
            String s = in.nextLine();
            char c = in.nextLine().charAt(0);
            int x = in.nextInt();
            double d = in.nextDouble();
            System.out.println("Integer- " +  x);
            System.out.println("Double- " +  d);
            System.out.println("String- " + s);
            System.out.println("Char- " + c);
        }

    }

