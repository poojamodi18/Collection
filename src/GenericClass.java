import model.Book;
import model.BookCategory;
import model.EducationalBook;

class Gen<T> {  // T is a type parameter
    T tObject;

    public Gen(T tObject) {
        this.tObject = tObject;
    }

    public void settObject(T tObject) {
        this.tObject = tObject;
    }

    public T getTObject() {
        return tObject;
    }

    public void showType() {
        System.out.println(tObject.getClass().getName());
    }

    public void showValue() {
        System.out.println("Value: " + tObject);
    }
}

class TwoGen<T, V> {
    T tObject;
    V vObject;

    public TwoGen(T tObject, V vObject) {
        this.tObject = tObject;
        this.vObject = vObject;
    }

    public T getTObject() {
        return tObject;
    }

    public void settObject(T tObject) {
        this.tObject = tObject;
    }

    public V getVObject() {
        return vObject;
    }

    public void setVObject(V vObject) {
        this.vObject = vObject;
    }

    public void showType() {
        System.out.println(tObject + " type: " + tObject.getClass().getName() + "\n" +
                vObject + " type: " + vObject.getClass().getName());
    }

    public void showValue() {
        System.out.println("Value: " + tObject);
        System.out.println("Value: " + vObject);
    }

}

class IntGen<T extends Number> {
    T[] intObj;

    public IntGen(T[] intObj) {
        this.intObj = intObj;
    }

    public T[] getIntObj() {
        return intObj;
    }

    public void setIntObj(T[] intObj) {
        this.intObj = intObj;
    }

    public void CalAverage() {
        double sum = 0.0;
        for (T t : intObj) {
            sum = sum + t.doubleValue();
        }
        System.out.println("Average is : " + (sum / intObj.length));
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Gen<Integer> genObj = new Gen<>(101);
        genObj.showType();
        genObj.showValue();

        genObj = new Gen<>(103);
        genObj.showValue();

        Gen<String> stringGen = new Gen<>("Generic Class");
        stringGen.showType();
        stringGen.showValue();

        Gen<Double> doubleGen = new Gen<>(123.98);
        doubleGen.showType();
        doubleGen.showValue();

        // Book book = new Book(102,"Git","Wiley","Mc Hill",400);
        Gen<Book> bookGen = new Gen<>(new Book(102, "Git", "Wiley", "Mc Hill", 400));
        bookGen.showType();
        bookGen.showValue();

        TwoGen<Integer, String> twoGen = new TwoGen<>(1, "String");
        twoGen.showType();

        TwoGen<Book, EducationalBook> bookTwoGen = new TwoGen<>(new Book(105, "DCN", "Forouzan", "McGraw Hill", 500),
                new EducationalBook(106, "Data Communication", "Wiley", "Mc Hill", 570,
                        BookCategory.REFERENCE_BOOK.getBookCategory(), "Networking"));
        bookTwoGen.showType();

        Integer[] intArray = {100, 200, 300, 400};
        IntGen<Integer> intGen = new IntGen<>(intArray);
        intGen.CalAverage();

    }
}
