public class FindFirstnonRepatingelementsinAraay {
    // Java program to find first non-repeating
// element.
        static int firstNonRepeating(int arr[], int n)
        {
            for (int i = 0; i < n; i++) {
                int j;
                for ( j = 0; j < n; j++)
                    if (i != j && arr[i] == arr[j])
                        break;
                if (j == n)
                    return arr[i];
            }

            return -1;
        }

        // Driver code
        public static void main(String[] args)
        {

            int arr[] = { 9, 4, 9, 6, 7, 4 };
            int n = arr.length;

            System.out.print(firstNonRepeating(arr, n));
        }
    }

// This code is contributed by Anant Agarwal.


