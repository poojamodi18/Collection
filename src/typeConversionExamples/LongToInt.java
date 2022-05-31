package typeConversionExamples;
//Convert long to integer and vice-versa
public class LongToInt {
    public static void main(String[] args) {
        long longNum = 1234567890L;
        int num = (int)longNum;
        System.out.println(num);
        longNum = 987656430L;
        try {
            num = Math.toIntExact(longNum);
            System.out.println(num);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        Long obj = Long.valueOf(longNum);

    }
}
