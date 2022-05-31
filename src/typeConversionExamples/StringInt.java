package typeConversionExamples;
//convert int to string and vice-versa
public class StringInt {
    public static void main(String[] args) {
        int num = 107;
        String numStr = String.valueOf(num);
        System.out.println(numStr);
        numStr = Integer.toString(99);
        System.out.println(numStr);

        String str = "777";
        int number = Integer.parseInt(str);
        System.out.println(number);
        number = Integer.valueOf("7");
        System.out.println(number);
    }
}
