package functionExamples;

//calculate the execution time of normal method and recursive method
public class CalculateExecutionTime {
    public static void main(String[] args) {
        String[] line = {"Calculate", "the", "execution", "time", "for", "normal", "method", "one", "two", "three", "four", "five", "six"};
        long milliStart = System.currentTimeMillis();
        long nanoStart = System.nanoTime();
        sortLine(line);
        long milliEnd = System.currentTimeMillis();
        long nanoEnd = System.nanoTime();
        System.out.println("Execution time for normal sort method");
        System.out.println("milli second : " + (milliEnd - milliStart));
        System.out.println("nano second : " + (nanoEnd - nanoStart));
        milliStart = System.currentTimeMillis();
        nanoStart = System.nanoTime();
        long ans = factorial(1550);
        milliEnd = System.currentTimeMillis();
        nanoEnd = System.nanoTime();
        System.out.println("Execution time for recursive method of factorial");
        System.out.println("milli second : " + (milliEnd - milliStart));
        System.out.println("nano second : " + (nanoEnd - nanoStart));

    }

    static void sortLine(String[] array) {
        int index = 0;
        while (index < array.length - 1) {
            if (array[index].compareTo(array[index + 1]) > 0) {
                String temp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temp;
                index = 0;
            } else {
                index++;
            }
        }
    }

    static long factorial(long num) {
        if (num != 0) {
            return num * factorial(num - 1);
        } else {
            return num;
        }
    }
}
