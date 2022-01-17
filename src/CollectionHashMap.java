import java.util.HashMap;
import java.util.Map;

public class CollectionHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(101, "one");
        map1.put(102, "two");
        map1.put(103, "one");
        // map1.put(101, "three");
        System.out.println(map1);
        for(Map.Entry en : map1.entrySet()){
            System.out.println(en.getKey()+" "+en.getValue());
        }
    }
}
