package collectionExamples;

import java.util.HashMap;
import java.util.Map;

public class GetKeyFromMap {
    public static void main(String[] args) {
        Map<String,String> fullName = new HashMap<>();
        fullName.put("Kim","Joon");
        fullName.put("Min","Yoon");
        fullName.put("Jung","Hope");
        fullName.put("Park","Jimin");
        fullName.put("Jeon","Gguk");

        for (Map.Entry<String, String> entry : fullName.entrySet()) {
            if(entry.getValue().equals("Hope")){
                System.out.println("Key : "+entry.getKey());
            }
        }
    }
}
