package newton.sorting;

public class MergeSorting {
    public static void main(String[] args) {
        int a[] = {32, 43,21,53, -2, 4, 1, 5};
        for(int i : implementMergeSort(a, 0, a.length - 1)) {
            System.out.print(i + " ");
        }
    }
    public static int[] implementMergeSort(int arr[], int start, int end)
    {
        // Your code here
        // You can have your own function where you will use
        // start and end position for divide purpose
        if (start == end) return new int[] {arr[start]};
        int m = (start + end) / 2;
        int[] firstHalf = implementMergeSort(arr, start, m);
        int[] secondHalf = implementMergeSort(arr, m + 1, end);
        int[] res = merge(firstHalf, secondHalf);
        return res;
    }

    public static int[] merge (int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                res[k++] = a[i++];
            } else {
                res[k++] = b[j++];
            }
        }

        while (i < a.length) {
            res[k++] = a[i++];
        }

        while (j < b.length) {
            res[k++] = b[j++];
        }

        return res;
    }
}
