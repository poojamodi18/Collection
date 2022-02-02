package typeConversionExamples;
//convert string to double and vice-versa
public class StringDouble {
    public static void main(String[] args) {
        String s = "7.6";
        double num = Double.parseDouble(s);  //Double.valueOf(s);
        System.out.println(num);

        double d = 13.77;
        String str = String.valueOf(d);
        System.out.println(str);
        d = 6.13;
        str = Double.toString(d);
        System.out.println(str);
    }
}
