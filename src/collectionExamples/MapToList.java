package collectionExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToList {
    public static void main(String[] args) {
        Map<Integer,String> names = new HashMap<>();
        names.put(1,"Joon");
        names.put(2,"Jin");
        names.put(3,"Yoon");
        names.put(4,"Hope");
        System.out.println(names);

        List<String> list = new ArrayList<>(names.values());
        List<Integer> integerList = names.keySet().stream().collect(Collectors.toList());  //using stream

        System.out.println("List : "+list);
        System.out.println("KeyList : "+integerList);
    }
}
