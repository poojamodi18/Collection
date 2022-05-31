package typeConversionExamples;
//convert char to int
public class CharToInt {
    public static void main(String[] args) {
        char ch = 'a';
        char ch1 = '6';
        char ch2 = '7';
        int num = ch;
        int num1 = Character.getNumericValue(ch1);   //if alphabet is the value passed as argument it will return unicode point in radix index
        int num2 = Integer.parseInt(String.valueOf(ch2));  //won't work with alphabet
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
    }
}
