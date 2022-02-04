package arrayExamples;

import java.util.Arrays;

//check if array contains a value or not using for loop and stream
public class SearchArray {
    public static void main(String[] args) {
        String[] line = {"check","if","string","array","contains","a","value","or","not"};
        String search = "array";
        for (String s : line) {
            if(s.equals(search)){
                System.out.println("Found "+search);
                break;
            }
        }

        String find = "or0";
        boolean found = Arrays.stream(line).anyMatch(str-> str.equals(find));
        System.out.println(found? "Found":"not found " + find);
    }
}
