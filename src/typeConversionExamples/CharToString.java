package typeConversionExamples;
//convert character to string and vice-versa
public class CharToString {
    public static void main(String[] args) {
        String string = "Convert character to string and vica-versa";
        char ch = string.charAt(0);
        char[] charArray = string.toCharArray();
        char[] charArrayTwo = {'C','o','n','v','e','r','t'};
        String stringTwo = String.valueOf(charArrayTwo);
        System.out.println("string to char : "+ch);
        System.out.println("string to character array: ");
        for (char c : charArray) {
            System.out.print(c);
        }

        System.out.println("\ncharacter array to string : "+stringTwo);
    }
}
