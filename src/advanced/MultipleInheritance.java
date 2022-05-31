package advanced;
interface A{
    void display();
}
interface B{
    void display();
}
class D{
    void display(){
        System.out.println("class d");
    }
}
class C implements A,B{

    @Override
    public void display() {
        System.out.println("Display method");
    }
}
class E extends D implements A{

    @Override
    public void display() {
        System.out.println("E display");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        E e = new E();
        e.display();
        C c = new C();
        c.display();
    }
}
