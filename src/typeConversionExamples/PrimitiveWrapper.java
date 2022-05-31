package typeConversionExamples;
//convert primitive data types to wrapper class object and vice-versa
public class PrimitiveWrapper {
    public static void main(String[] args) {
        int intNum = 77;
        float floatNum = 6.13f;
        double doubleNum = 6013.13;

        Integer intObj = new Integer(intNum);
        Float floatObj = Float.valueOf(floatNum);
        Double doubleObj = doubleNum;

        int i = intObj;

        System.out.println(intObj.getClass().getName());
        System.out.println(floatObj.getClass().getName());
        System.out.println(doubleObj.getClass().getName());
    }
}
