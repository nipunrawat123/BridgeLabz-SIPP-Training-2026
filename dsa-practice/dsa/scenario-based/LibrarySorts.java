import java.util.Random;

public class LibrarySorts {
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }


    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);

            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void countingSort(int[] arr) {

        int max = 20; // Genre codes 1–20
        int[] count = new int[max + 1];

        for (int num : arr)
            count[num]++;

        int index = 0;

        for (int i = 1; i <= max; i++) {

            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    static void compareRuntime(int size) {

        Random random = new Random();

        int[] mergeArr = new int[size];
        int[] quickArr = new int[size];
        int[] countArr = new int[size];

        for (int i = 0; i < size; i++) {
            int value = random.nextInt(20) + 1;

            mergeArr[i] = value;
            quickArr[i] = value;
            countArr[i] = value;
        }

        long start, end;

        start = System.nanoTime();
        mergeSort(mergeArr, 0, mergeArr.length - 1);
        end = System.nanoTime();
        long mergeTime = end - start;

        start = System.nanoTime();
        quickSort(quickArr, 0, quickArr.length - 1);
        end = System.nanoTime();
        long quickTime = end - start;

        start = System.nanoTime();
        countingSort(countArr);
        end = System.nanoTime();
        long countTime = end - start;

        System.out.println("\nArray Size : " + size);
        System.out.println("Merge Sort Time    : " + mergeTime + " ns");
        System.out.println("Quick Sort Time    : " + quickTime + " ns");
        System.out.println("Counting Sort Time : " + countTime + " ns");
    }

    public static void main(String[] args) {

        compareRuntime(100);
        compareRuntime(1000);
        compareRuntime(10000);
    }
}