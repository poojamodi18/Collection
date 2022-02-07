package algorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {6,3,8,7,13,12,18};
        int swap = 1;
        for (int number : numbers) {
            System.out.print(number+" ");
        }
        while (swap !=0){
            for (int i = 0; i < numbers.length-1; i++) {
                if(numbers[i]>numbers[i+1]){
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                    swap++;
                }else {
                    swap=0;
                }
            }
        }
        System.out.println("\nSorted");
        for (int number : numbers) {
            System.out.print(number+" ");
        }
    }
}
