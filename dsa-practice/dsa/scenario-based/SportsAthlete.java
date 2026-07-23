import java.util.Arrays;

public class SportsAthlete {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int swaps = 0;
        boolean sorted = true;

        System.out.println("Bubble Sort Passes:");

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    swapped = true;
                }
            }

            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(arr));

            if (!swapped) {
                break;
            } else {
                sorted = false;
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Total Swaps = " + swaps);

        if (sorted)
            System.out.println("Array was already sorted (Best Case).");
        else
            System.out.println("Array was NOT initially sorted.");
    }
    public static void insertionSort(int[] arr) {

        System.out.println("\nInsertion Sort Passes:");

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.println("Pass " + i + ": " + Arrays.toString(arr));
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
    public static void topThree(int[] arr) {

        Arrays.sort(arr);

        System.out.println("\nTop 3 Medalists:");

        System.out.println("Gold   : " + arr[arr.length - 1]);
        System.out.println("Silver : " + arr[arr.length - 2]);
        System.out.println("Bronze : " + arr[arr.length - 3]);
    }

    public static void main(String[] args){
        int[] scores = {64, 25, 12, 22, 11};

        int[] bubbleArray = scores.clone();
        int[] insertionArray = scores.clone();
        int[] medalArray = scores.clone();

        bubbleSort(bubbleArray);

        insertionSort(insertionArray);

        topThree(medalArray);
    }
}