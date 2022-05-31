package collectionExamples;

import java.util.HashSet;
import java.util.Set;

public class SetOperation {
    public static void main(String[] args) {
        Set<Integer> year1 = new HashSet<>();
        year1.add(1994);
        year1.add(1995);
        year1.add(1997);
        year1.add(1993);
        System.out.println("Set 1 : "+year1);

        Set<Integer> year2 = new HashSet<>();
        year2.add(1992);
        year2.add(1994);
        year2.add(1995);
        System.out.println("Set 2 : "+year2);

        //subset
        System.out.println("Set 2 is subset of set 1 : "+year1.containsAll(year2));

        //union
        year1.addAll(year2);
        System.out.println("Union : "+year1);

        //subset
        System.out.println("Set 2 is subset of union : "+year1.containsAll(year2));

        //Intersection
        year1.retainAll(year2);
        System.out.println("Intersection of union and set 2: "+year1);

        year1.clear();
        year1.add(1994);
        year1.add(1995);
        year1.add(1997);
        year1.add(1993);

        //differencr
        year1.retainAll(year2);
        System.out.println("Difference between set 1 and set 2 : "+year1);
    }
}
