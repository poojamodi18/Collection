package algorithm;

public class QuickSort {
    public static void main(String[] args) {
        int[] numbers = {10, 80, 30, 90, 40, 50, 70};
        int p = 0;
        int r = numbers.length - 1;
        quickSort(numbers,p,r);
        System.out.println("Sorted array");
        for (int number : numbers) {
            System.out.print(number+" ");
        }
    }

    private static void quickSort(int[] numbers, int p, int r) {
        int piv = numbers[r];
        int k=0,i=0;
        while (i<r){
            if(numbers[i]<piv){
                int temp = numbers[k];
                numbers[k] = numbers[i];
                numbers[i] = temp;
                k++;
            }
            i++;
        }
        int temp = numbers[k];
        numbers[k] = numbers[i];
        numbers[i] = temp;
        if(k<r && k>0) {
            quickSort(numbers, p, k-1);
            quickSort(numbers, k + 1, r);
        }
    }
}
