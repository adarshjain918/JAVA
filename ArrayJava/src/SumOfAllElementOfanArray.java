import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfAllElementOfanArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = Arrays.stream(array).sum();
        System.out.println(sum);

        int sum1 = IntStream.of(array).sum();
        System.out.println(sum1);

        int sum2 = Arrays.stream(array).reduce((x,y)->x+y).getAsInt();
        System.out.println(sum2);

        int sum3 = Arrays.stream(array).reduce(Integer ::sum).getAsInt();
        System.out.println(sum3);

        long sum4 = Arrays.stream(array).summaryStatistics().getSum();
        System.out.println(sum4);
    }
}
