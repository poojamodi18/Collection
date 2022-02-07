package collectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuplicateElementList {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Kim");
        name.add("Kim");
        name.add("Min");
        name.add("Jang");
        name.add("Park");
        name.add("Kim");
        name.add("Jeon");

        System.out.println(name);
        Collections.sort(name);
        System.out.println(name);

        for (int i = 0; i < name.size() - 1; i++) {
            if (name.get(i).equals(name.get(i + 1))) {
                name.remove(i + 1);
                i--;
            }
        }
        System.out.println(name);
    }
}
