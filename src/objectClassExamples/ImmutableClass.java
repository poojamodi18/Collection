package objectClassExamples;
final class Immutable{
    private int intNumber;

    public Immutable(int number) {
        this.intNumber = number;
    }

    public int getIntNumber() {
        return intNumber;
    }
}
public class ImmutableClass {
    public static void main(String[] args) {
        Immutable number = new Immutable(7);
        System.out.println(number.getIntNumber());
    }
}
