package advanced;
public class LookupEnum {
    public enum Genre{
        BALLAD,COUNTRY,HIP_HOP,POP,ROCK,SOUL
    }
    public static void main(String[] args) {
        System.out.println(Genre.BALLAD);
        System.out.println(Genre.valueOf("POP"));       //argument in valueOf is case-sensitive
        System.out.println(Genre.SOUL);
        System.out.println("Enum Values");
        for (Genre value : Genre.values()) {
            System.out.println(value);
        }
    }
}
