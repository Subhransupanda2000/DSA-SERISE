public class Sumoftwoarrays {

        public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = {6, 7, 8, 9, 10};

            int[] sumArray = new int[array1.length]; // Assuming both arrays have the same length

            for (int i = 0; i < array1.length; i++) {
                sumArray[i] = array1[i] + array2[i];
            }

            // Printing the sum array
            for (int num : sumArray) {
                System.out.print(num + " ");
            }
        }
    }


