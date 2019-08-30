package sorts;

public class QuickSort {

    public static int[] sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);

        return arr;
    }

    private static void quickSort(int arr[], int left, int right) {
        int i, j, partition, temp;

        i = left;
        j = right;
        partition = arr[(left + right) / 2];

        do {
            while (arr[i] < partition)
                i++;
            while (partition < arr[j])
                j--;
            if (i <= j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        } while (i <= j);

        if (left < j){
            quickSort(arr, left, j);
        }

        if (i < right){
            quickSort(arr, i, right);
        }

    }
}
