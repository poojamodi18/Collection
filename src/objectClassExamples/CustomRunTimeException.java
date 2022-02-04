package objectClassExamples;
//handle runtime exception using custom exception
//array index out of bound exception
class runException extends RuntimeException{
    runException(String message){
        super(message);
    }
}
public class CustomRunTimeException {
    public static void main(String[] args) throws runException {
        Integer[] numbers = {1,2,null,4,5};
        for (int i = 0; i < numbers.length; i++) {
            if(null == numbers[i]){
                throw new runException("null value in the array");
            }
            System.out.println(numbers[i]);
        }
    }
}
