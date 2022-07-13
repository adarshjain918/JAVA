import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
//public class SortArrayElements {
//    How to Sort an Array in Java
//  ->  The sorting is a way to arrange elements of a list or array in a certain order.
//  ->  The order may be in ascending or descending order.

//    Sort Array in Ascending Order
//   *  Method
//     using the sort() method and
//     without  using the sort() method.
//


//   a. Using the for Loop
//   b. Using the User Defined Method
//   c. Using the sort() Method
//    In Java, Arrays is the class defined in the java.util package
//    that provides sort() method to sort an array in ascending order.
//    It uses Dual-Pivot Quicksort algorithm for sorting.
//    Its complexity is O(n log(n)). It is a static method that parses an array as a parameter
//    and does not return anything. We can invoke it directly using the class name.
//    It accepts an array of type int, float, double, long, char, byte.

//    Syntax:
//
// -->   public static void sort(int[] a)
//    Where a is an array to be short.
//
//
//    Let's sort an array using the sort() method of the Arrays class.
//
//    In the following program, we have defined an array of type integer. After that,
//    we have invoked the sort() method of the Arrays class and parses the array to be sort.
//    For printing the sorted array, we have used for loop.
//
//            SortArrayExample1.java
//
/*public static void main(String[] args) {
    int a[] = new int[]{90, 23, 5, 109, 12, 22, 67, 34};
    Arrays.sort(a);
    System.out.println("Elementsof an array sortee in accending orfer ");
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
    }
}
}*/
//import java.util.Arrays;
//    public class SortArrayExample1
//    {
//        public static void main(String[] args)
//        {
////defining an array of integer type
//            int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
////invoking sort() method of the Arrays class
//     -->    Arrays.sort(array);
//            System.out.println("Elements of array sorted in ascending order: ");
////prints array using the for loop
//            for (int i = 0; i < array.length; i++)
//            {
//                System.out.println(array[i]);
//            }
//        }
//    }
//    Output:
//
//    Array elements in ascending order:
//            5
//            12
//            22
//            23
//            34
//            67
//            90
//            109
//    In the above program, we can also use the toSting() method of the Arrays class to print the array,
//    as shown in the following statement. It returns a string representation of the specified array.
//
//            System.out.printf(Arrays.toString(array));
//    Without Using the Method
//    Using the for Loop
//    In the following example, we have initialized an array of integer
//    type and sort the array in ascending order.
//
// ** Example2  AAGAR NEGATIVE INTEGER RAHA TAB THIS METHOD KO USED KARNA PADATA HE
//****************AssendingOrder*********************************
  /*  public static void main(String[] args) {
        int a []= new int[] {78,38,1,3,90,38,-1,-4,6,55,20,-65};
        System.out.println("Ascending array");
        for (int i =0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++)
            {
                int temp;
                if (a[i]>a[j])
                {
                    temp = a[i];
                    a[i] =a[j];
                    a[j] = temp;

                }
            }
        }
        for (int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }}*/
//**************DecendingOrder*********************************************
 /* public static void main(String[] args) {
      int a []= new int[] {78,38,1,3,90,38,-1,-4,6,55,20,-65};
      System.out.println("Ascending array");
      for (int i =0;i<a.length;i++){
          for (int j=i+1;j<a.length;j++)
          {
              int temp;
              if (a[i]<a[j])
              {
                  temp = a[j];
                  a[j] =a[i];
                  a[i] = temp;

              }
          }
      }
      for (int i =0;i<a.length;i++){
          System.out.println(a[i]);
      }

  }}

  */

//***************Defined Method****************************
//    Using the User Defined Method
// we have defined a method named sortArray()
/*
    public static void main(String[] args) {
        int a[] =  {12, 45, 1, -1, 0, 4, 56, 23, 89, -21, 56, 27};
        for (int i =0;i<a.length;i++) {
            System.out.println(a[i]);
            sorta(a,a.length);
            sortArray(array, array.length);
        }
    }
 */
//
//    public class SortArrayExample3
//    {
//        public static void main(String[] args)
//        {
//            int i;
////initializing an array
//            int array[] = {12, 45, 1, -1, 0, 4, 56, 23, 89, -21, 56, 27};
//            System.out.print("Array elements before sorting: \n");
//            for(i = 0; i < array.length; i++)
//                System.out.println(array[i]);
////invoking user defined method
//            sortArray(array, array.length);
//            System.out.print("Array elements after sorting: \n");
////accessing elements of the sorted array
//            for(i = 0; i <array.length; i++)
//            {
//                System.out.println(array[i]);
//            }
//        }
//        //user defined method to sort an array in ascending order
//        private static void sortArray(int array[], int n)
//        {
//            for (int i = 1; i < n; i++)
//            {
//                int j = i;
//                int a = array[i];
//                while ((j > 0) && (array[j-1] > a))   //returns true when both conditions are true
//                {
//                    array[j] = array[j-1];
//                    j--;
//                }
//                array[j] = a;
//            }
//        }
//    }
//    Output:
//
//    Array elements before sorting:
//            12
//            45
//            1
//            -1
//            0
//            4
//            56
//            23
//            89
//            -21
//            56
//            27
//    Array elements after sorting:
//            -21
//            -1
//            0
//            1
//            4
//            12
//            23
//            27
//            45
//            56
//            56
//            89
//    Sort Array in Descending Order
//    The descending order arranges the elements in the highest to lowest order. We can perform sorting in the following ways:
//
//    Using the reverseOrder() Method
//    Without using the method
//    Using the for Loop
//    Using the User Defined Method
//    Using the reverseOrder() Method
//    Java Collections class provides the reverseOrder() method to sort the array in reverse-lexicographic order. It is a static method, so we can invoke it directly by using the class name. It does not parse any parameter. It returns a comparator that imposes the reverse of the natural ordering (ascending order).
//
//    It means that the array sorts elements in the ascending order by using the sort() method, after that the reverseOrder() method reverses the natural ordering, and we get the sorted array in descending order.
//
//            Syntax:
//
//    public static <T> Comparator<T> reverseOrder()
//    Suppose, a[] is an array to be sort in the descending order. We will use the reverseOrder() method in the following way:
//
//            Arrays.sort(a, Collections.reverseOrder());
//    Let's sorts an array in the descending order.
//
//    In the following program, a point to be noticed that we have defined an array as Integer. Because the reverseOrder() method does not work for the primitive data type.
//
//    SortArrayExample4.java
//
//import java.util.Arrays;
//import java.util.Collections;
//    public class SortArrayExample4
//    {
//        public static void main(String[] args)
//        {
//            Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};
//// sorts array[] in descending order
  //            Arrays.sort(array, Collections.reverseOrder());
//            System.out.println("Array elements in descending order: " +Arrays.toString(array));
//        }
//    }
//    Output:
//
//    Array elements in descending order: [205, 110, 102, 78, 23, 11, 6, 4, 0, -1, -9]
//    Let's see another program that sorts array elements in alphabetical order.
//
//    SortArrayExample5.java
//
//import java.util.Arrays;
//import java.util.Collections;
//    public class SortArrayExample5
//    {
//        public static void main(String[] args)
//        {
//            String [] strarray = {"Mango", "Apple", "Grapes", "Papaya", "Pineapple", "Banana", "Orange"};
//// sorts array[] in descending order
//            Arrays.sort(strarray, Collections.reverseOrder());
//            System.out.println("Array elements in descending order: " +Arrays.toString(strarray));
//        }
//    }
//    Output:
//
//    Array elements in descending order: [Papaya, Pineapple, Orange, Mango, Grapes, Banana, Apple]
//    Without Using the Method
//    Using the for Loop
//    In the following example, we have initialized an integer array and perform sorting in descending order.
//
//            SortArrayExample6.java
//
//    public class SortArrayExample6
//    {
//        public static void main(String[] args)
//        {
//            int temp;
////initializing an array
//            int a[]={12,5,56,-2,32,2,-26,9,43,94,-78};
//            for (int i = 0; i < a.length; i++)
//            {
//                for (int j = i + 1; j < a.length; j++)
//                {
//                    if (a[i] < a[j])
//                    {
//                        temp = a[i];
//                        a[i] = a[j];
//                        a[j] = temp;
//                    }
//                }
//            }
//            System.out.println("Array elements in descending order:");
////accessing element of the array
//            for (int i = 0; i <=a.length - 1; i++)
//            {
//                System.out.println(a[i]);
//            }
//        }
//    }
//    Output:
//
//    Array elements in descending order:
//            94
//            56
//            43
//            32
//            12
//            9
//            5
//            2
//            -2
//            -26
//            -78
//    Using the User Defined Method
//    SortArrayExample7.java
//
//import java.util.Scanner;
//    public class SortArrayExample7
//    {
//        public static void main(String[] args)
//        {
//            int n, temp;
//            Scanner s = new Scanner(System.in);
//            System.out.print("Enter the number of elements: ");
//            n = s.nextInt();
//            int a[] = new int[n];
//            System.out.println("Enter the elements of the array: ");
//            for (int i = 0; i < n; i++)
//            {
//                a[i] = s.nextInt();
//            }
//            for (int i = 0; i < n; i++)
//            {
//                for (int j = i + 1; j < n; j++)
//                {
//                    if (a[i] < a[j])
//                    {
//                        temp = a[i];
//                        a[i] = a[j];
//                        a[j] = temp;
//                    }
//                }
//            }
//            System.out.println("Array elements in descending order:");
//            for (int i = 0; i < n - 1; i++)
//            {
//                System.out.println(a[i]);
//            }
//            System.out.print(a[n - 1]);
//        }
//    }
//    Output:
//
//    Enter the number of elements: 7
//    Enter the elements of the array:
//            12
//            5
//            56
//            -2
//            32
//            2
//            -26
//    Array elements in descending order:
//            56
//            32
//            12
//            5
//            2
//            -2
//            -26
//    How to Sort Subarray
//    An array derived from the array is known as subarray. Suppose, a[] is an array having the elements [12, 90, 34, 2, 45, 3, 22, 18, 5, 78] and we want to sort array elements from 34 to 18. It will sort the subarray [34, 2, 45, 3, 22, 18] and keep the other elements as it is.
//
//    To sort the subarray, the Arrays class provides the static method named sort(). It sorts the specified range of the array into ascending order. We can also sort the array of type long, double, float, char, byte, etc.
//
//            Syntax:
//
//    public static void sort(int[] a, int fromIndex, int toIndex)
//    The method parses the following three parameters:
//
//    a: An array to be sort.
//            fromIndex: The index of the first element of the subarray. It participates in the sorting.
//            toIndex: The index of the last element of the subarray. It does not participate in the sorting.
//    If formIndex is equal to the toIndex, the range to be sorted is empty. It throws IllegalArgumentException if fomIndex is greater than toIndex. It also throws ArrayIndexOutOfBoundsException if fromIndex < 0 or toIndex > a.length.
//
//            Let's sort a subarray through a Java program.
//
//    SortSubarrayExample.java
//
//import java.util.Arrays;
//    public class SortSubarrayExample
//    {
//        public static void main(String[] args)
//        {
////defining an array
//            int[] a = {12, 90, 34, 2, 45, 3, 22, 18, 5, 78};
//// sorts subarray form index 2 to 7
//            Arrays.sort(a, 2, 7);
////prints array using the for loop
//            for (int i = 0; i < a.length; i++)
//            {
//                System.out.println(a[i]);
//            }
//        }
//    }
//    Output:
//
//    Sorted Subarray:
//            12
//            90
//            2
//            3
//            22
//            34
//            45
//            18
//            5
//            78

// }
