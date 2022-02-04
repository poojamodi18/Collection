package objectClassExamples;
//add two real numbers using class and add() method pass class as argument and return class
public class Complex {
    double numA;
    double numB;

    public Complex(double numA, double numB) {
        this.numA = numA;
        this.numB = numB;
    }

    static Complex add(Complex obj1, Complex obj2){
        double sum1,sum2;
        sum1 = obj1.numA + obj2.numA;
        sum2 = obj1.numB + obj2.numB;
        return new Complex(sum1,sum2);
    }

    public static void main(String[] args) {
        Complex complex1 = new Complex(5.6,7.3);
        Complex complex2 = new Complex(13.6,7.13);
        Complex complex = add(complex1,complex2);
        System.out.println("Sum : "+(complex.numA+complex.numB));
    }
}
