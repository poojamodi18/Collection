package typeConversionExamples;
//convert string to boolean and vice-versa
public class BooleanString {
    public static void main(String[] args) {
        boolean boolTrue = true;
        boolean boolFalse = false;
        String trueStr = String.valueOf(boolTrue);
        String falseStr = Boolean.toString(boolFalse);
        System.out.println(trueStr);
        System.out.println(falseStr);
        boolean t = Boolean.parseBoolean(trueStr);
        System.out.println(t);
        boolean f = Boolean.valueOf(falseStr);
        System.out.println(f);

    }
}
