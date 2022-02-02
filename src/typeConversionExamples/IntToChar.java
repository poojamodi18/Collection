package typeConversionExamples;
//convert int variable to char
public class IntToChar {
    public static void main(String[] args) {
        int num = 103;
        char ch = (char) num;
        System.out.println(ch);
        num = 105;
        ch = (char) num;
        System.out.println(ch);
    }
}
