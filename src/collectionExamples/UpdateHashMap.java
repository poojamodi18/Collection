package collectionExamples;

import java.util.HashMap;
import java.util.Map;

public class UpdateHashMap {
    public static void main(String[] args) {
        Map<String,String> fullName = new HashMap<>();
        fullName.put("Kim","Joon");
        fullName.put("Min","Yoon");
        fullName.put("Jung","Hope");
        fullName.put("Park","Jimin");
        fullName.put("Jeon","Gguk");
        System.out.println(fullName);

        //using put
        fullName.put("Kim","Jin");
        System.out.println(fullName);

        //merge
        fullName.merge("Kim","Tae",(oldname,newname)->oldname+newname);
        System.out.println(fullName);
    }
}
