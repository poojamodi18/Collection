package typeConversionExamples;
//convert double to int and vice-versa
public class DoubleInt {
    public static void main(String[] args) {
        int num = 107;
        double numDo = num;
        System.out.println(numDo);
        num = 77;
        numDo = Double.valueOf(num);
        System.out.println(numDo);

        double d = 100.77;
        int number = (int) d;
        System.out.println(number);
        d = 77.3;
        number = (int) Math.round(d);
        System.out.println(number);
    }
}
