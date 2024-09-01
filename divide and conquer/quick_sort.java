public class quick_sort {

    public static int partition(int arr[], int si, int ei) {

        // let say my pivot be the last value of array
        int pivot = arr[ei];
        // iterator bnalo
        int i = si - 1; // iterator ko initialize kro -1 se

        for (int j = si; j <= ei - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[j] arr[i]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // swap arr[ei] arr[i]
        int temp = pivot; // arr[ei] = pivot
        arr[ei] = arr[i]; // call by value is not applicable while swpping in indexes
        arr[i] = temp;

        return i;

    }

    public static void quickSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // partition function
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx - 1);
        quickSort(arr, pidx + 1, ei);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);

    }
}