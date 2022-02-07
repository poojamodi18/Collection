package collectionExamples;

import java.util.ArrayList;
import java.util.List;

//join two lists
public class JoinList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Joon");
        list.add("Jin");
        list.add("Yoon");
        list.add("Hope");

        List<String> stringList = new ArrayList<>();
        stringList.add("Min");
        stringList.add("Tae");
        stringList.add("Jeon");

        List<String> combineList = new ArrayList<>();
        combineList.addAll(list);
        combineList.addAll(stringList);
        System.out.println(combineList);

        

        /*
        List<String> combineList = ListUtils.union(list,stringList);
        //import org.apache.commons.collections.ListUtils; is required to use above method
        */


    }
}
