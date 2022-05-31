package basicJava;
//check whether the string is null or empty or neither using method and if else
public class NullString {
    public static void main(String[] args) {
        String string1 = "         ";
        System.out.println("String is : "+isNullString(string1));
    }
    static String isNullString(String str){
        if(str == null){
            return "null";
        }else if(str.trim().isEmpty()){
            return "empty";
        }else {
            return "not empty nor null";
        }
    }
}
