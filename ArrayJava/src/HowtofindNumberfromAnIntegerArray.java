/*
Input: arr[] = [5, 1, 1, 9, 7, 2, 6, 10], key = 7
Output: true

Input: arr[] = [-1, 1, 5, 8], key = -2
Output: false
 */

    // Java program to check whether
// an element is present in array or not

import java.util.Arrays;
import java.util.stream.IntStream;

public class HowtofindNumberfromAnIntegerArray {

        // Function return true if given element
        // found in array
        private static void check(int[] arr, int toCheckValue)
        {
            // check if the specified element
            // is present in the array or not
            // using Linear Search method
            boolean test = false;
            for (int element : arr) {
                if (element == toCheckValue) {
                    test = true;
                    break;
                }
            }

            // Print the result
            System.out.println("Is " + toCheckValue
                    + " present in the array: " + test);
        }

        public static void main(String[] args)
        {

            // Get the array
            int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };

            // Get the value to be checked
            int toCheckValue = 7;

            // Print the array
            System.out.println("Array: "
                    + Arrays.toString(arr));

            // Check if this value is
            // present in the array or not
            check(arr, toCheckValue);
        }
    }

