package arrayExamples;

import java.util.Scanner;

//find standard deviation of an integer array using function
public class StandardDeviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numbers : ");
        String[] line = sc.nextLine().split(" ");
        Integer[] numbers = new Integer[line.length];
        for (int i = 0; i < line.length; i++) {
            numbers[i] = Integer.parseInt(line[i]);
        }
        System.out.println("Standard Deviation : "+ calculateDeviation(numbers));
    }

    private static double calculateDeviation(Integer[] numbers) {
        double deviation = 0.0,sum=0.0;
        for (Integer number : numbers) {
            sum += number;
        }
        sum = sum / numbers.length;
        for (Integer number : numbers) {
            deviation += Math.pow(number - sum, 2);
        }
        return Math.sqrt(deviation/numbers.length);
    }
}
