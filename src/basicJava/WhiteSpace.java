package basicJava;
//remove all white space from string
public class WhiteSpace {
    public static void main(String[] args) {
        String str = " This string    has multiple white   spaces   .";
        System.out.println(str);
        str = str.replaceAll(" ","");   // other option for " " is "\\s"
        System.out.println(str);

    }
}
