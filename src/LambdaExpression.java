import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

@FunctionalInterface
interface NumberInterface {
    int getValue();
}
@FunctionalInterface
interface StringInterface {
    void showString(int index);
}

//Generic Functional Interface
@FunctionalInterface
interface GenInter<T> {
    T GenMethod(T t);
}
@FunctionalInterface
interface GenArray<T, V> {
    V GenArrayMethod(T t);
}

public class LambdaExpression {
    public static void main(String[] args) {
        NumberInterface number;
        number = () -> 100;
        System.out.println(number.getValue());
        StringInterface str;
        str = (int index) -> {
            if (index == 0) {
                System.out.println("Index 0 ");
            } else if (index > 0 && index <= 10) {
                System.out.println("Index is between 0 to 10");
            } else {
                System.out.println("Invalid index");
            }
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number for index : ");
        str.showString(sc.nextInt());

        //Lambda expression with for-each
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        arrayList.forEach((i) -> System.out.println("Value : " + i));

        GenInter<String> genInter;
        genInter = (String s) -> {
            System.out.println(s.toLowerCase());
            System.out.println(s.toUpperCase());
            return s + " Expression ";
        };
        System.out.println(genInter.GenMethod("GeNeRie and Lambda"));

        GenInter<Integer> squareInt;

        squareInt = (integerNum) -> {
            int square;
            square = integerNum * integerNum;
            return square;
        };
        System.out.println("Square of 97 is " + squareInt.GenMethod(97));

        GenArray<ArrayList<Integer>, Integer> arrayListManipulation;
        arrayListManipulation = (arrayList1) -> {
            int sum = 0;
            for (int i : arrayList) {
                sum += i;
            }
            return sum;
        };
        Integer ans = arrayListManipulation.GenArrayMethod(arrayList);
        System.out.println(ans);

        //in-built functional interface
        Function<Integer,Integer> factorial = (n) ->{
            int factAns = 1;
            for(int i=1;i<=n;i++){
                factAns *= i;
            }
            return factAns;
        };
        System.out.println("Factorial of 7 : "+factorial.apply(7));

        Function<String,String> reverseString = (originalStr)->{
            String reverseStr="";
            for(int i=0;i<originalStr.length();i++){
                reverseStr = (originalStr.charAt(i))+reverseStr;
            }
            return reverseStr;
        };
        System.out.println("Reverse of Lambda Expression : "+reverseString.apply("Lambda Expression"));
    }
}
