package collectionExamples;

import java.util.ArrayList;
import java.util.List;

//iterate list using lambda
public class LambdaIterateList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Joon");
        names.add("Jin");
        names.add("Yoon");
        names.add("Hope");
        names.add("Min");
        names.add("Tae");
        names.add("Jeon");

        names.forEach(n -> System.out.print(n+" "));
    }
}
