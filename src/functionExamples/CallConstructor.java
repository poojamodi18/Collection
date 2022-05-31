package functionExamples;

public class CallConstructor {
    private CallConstructor(){
        this(5);
        System.out.println("No-arg Constructor");
    }
    CallConstructor(int num){
        this(10,"2nd");
        System.out.println("one-arg Constructor "+num);
    }
    CallConstructor(int num,String str){
        System.out.println(super.getClass().getName());
        System.out.println(str+" two-args Constructor " +num);
    }

    public static void main(String[] args) {
        CallConstructor constructor = new CallConstructor();
    }
}
/*class Test {
    CallConstructor constructor = new CallConstructor(); // compile time error because no arg constructor is private
    CallConstructor callConst = new CallConstructor(1);
}*/
