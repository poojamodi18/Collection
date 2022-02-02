package basicJava;

//find the occurrence of char in string
public class OccurrenceOfChar {
    public static void main(String[] args) {
        String s = "C find the occurrence of one character in this string";
        char ch = 'c';
        int occur = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) == ch) {       //Objects.equals(s.charAt(i),ch)
                occur++;
            }
        }
        System.out.println(s);
        System.out.println("Occurrence of " + ch + " in above string is : " + occur);
    }
}
