import java.util.HashSet;
import java.util.Set;

public class CollectionHashSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("one");
        set1.add("two");
        set1.add("one");
        System.out.println(set1);

    }
}
