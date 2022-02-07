package collectionExamples;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByKeys {
    public static void main(String[] args) {
        Map<String,String> fullName = new HashMap<>();
        fullName.put("Kim","Joon");
        fullName.put("Min","Yoon");
        fullName.put("Jung","Hope");
        fullName.put("Park","Jimin");
        fullName.put("Jeon","Gguk");

        for (Map.Entry<String, String> entry : fullName.entrySet()) {
            System.out.print(entry.getKey()+" ");
        }
        System.out.println("\nAfter sorting");
        LinkedHashMap<String,String> sortedNames = fullName.entrySet().stream()
                .sorted((n1,n2)->n1.getKey().compareTo(n2.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(name1,name2)-> name1,LinkedHashMap::new));
        for (Map.Entry<String, String> stringEntry : sortedNames.entrySet()) {
            System.out.print(stringEntry.getKey()+" ");
        }

        //using tree map
        TreeMap<String,String> treeSorted = new TreeMap<>(fullName);
        System.out.println("\nTree Set "+treeSorted.keySet());
    }
}
