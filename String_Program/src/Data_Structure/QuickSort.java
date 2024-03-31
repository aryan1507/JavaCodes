
package Data_Structure;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = {1, 5, 3, 5, 7, 8};
        sort(a, 0, a.length - 1);
        for (int n : a) {
            System.out.println(n);
        }
    }

    public static void sort(int[] a, int start, int end) {
        int i = start;
        int j = end;
        int pivot = a[(start + end) / 2];
        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (start < j) {
            sort(a, start, j);
        }
        if (i < end) {
            sort(a, i, end);
        }
    }
}