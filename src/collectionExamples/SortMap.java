package collectionExamples;

import java.util.*;
import java.util.stream.Collectors;

//Sort Map by values and add it to linkedHashMap
public class SortMap {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "Joon");
        names.put(2, "Jin");
        names.put(3, "Yoon");
        names.put(4, "Hope");
        names.put(5, "Min");
        names.put(6, "Tae");
        names.put(7, "Jeon");
        System.out.println(names);

        /*HashMap<Integer,String> sortedName = names.entrySet().stream().sorted(
                        (l1, l2) ->l1.getValue().compareTo(l2.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)-> e1,LinkedHashMap::new));
        System.out.println(sortedName);*/

        //using list of map.entry
        List<Map.Entry<Integer, String>> list = new LinkedList<>(names.entrySet());
        LinkedHashMap<Integer, String> sorted = new LinkedHashMap<>();
        Collections.sort(list, (l1, l2) ->l1.getValue().compareTo(l2.getValue()));

        for (Map.Entry<Integer, String> entry : list) {
            sorted.put(entry.getKey(), entry.getValue());
        }
        System.out.println(sorted);
    }
}
