package collectionExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistAsArgument {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Joon");
        names.add("Jin");
        names.add("Yoon");
        names.add("Hope");
        names.add("Min");
        names.add("Tae");
        names.add("Jeon");

        display(names);
    }

    private static void display(ArrayList<String> names) {
        names.forEach(n ->
        {
            if(n.length()<=3){
                System.out.println(n);
            }
        });
    }
}
