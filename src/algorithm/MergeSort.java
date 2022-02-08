package algorithm;

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {14, 7, 3, 12, 9, 11};
        int p = 0;
        int r = numbers.length - 1;
        mergeSort(numbers,p,r);
        System.out.println("Sorted array");
        for (int number : numbers) {
            System.out.print(number+" ");
        }

    }
    static void mergeSort(int[] array, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(array, p, q);
            mergeSort(array, q + 1, r);
            merge(array, p, q, r);
        }
    }

    static void merge(int[] array, int p, int q, int r) {
        int lLen = q - p + 1;
        int rLen = r - q;
        int[] left = new int[lLen];
        int[] right = new int[rLen];
        //adds element from number array to sub array
        for (int i = 0; i < lLen; i++)
            left[i] = array[p + i];
        for (int j = 0; j < rLen; j++)
            right[j] = array[q + 1 + j];

        int i=0, j=0, k=p;
        while (i < lLen && j < rLen) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < lLen) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < rLen) {
            array[k] = right[j];
            j++;
            k++;
        }
    }
}
