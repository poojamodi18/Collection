import model.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        list.add(1, "One");
        //Printing the arraylist object
        System.out.println(list);
        //for-each loop
        for (String s : list) {
            System.out.println(s);
        }

        //get and remove
        System.out.println(list.get(0));
        list.remove(1);
        System.out.println(list);

        //sort
        Collections.sort(list);
        System.out.println(list);

        System.out.println(list.get(0));

        //set
        list.set(0, "One");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        //Add new arraylist to existing using addAll()
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("One");
        list2.add("Two");

        System.out.println("AddAll method called : "+list.addAll(list2));
        System.out.println(list);

        //List with class object as value
        Book book1 = new Book(101, "Operating System", "Galvin", "Wiley",300);
        Book book2 = new Book(102, "DCN", "Forouzan", "Mc Hill",450);

        ArrayList<Book> bookArrayList = new ArrayList<>();
        bookArrayList.add(book1);
        bookArrayList.add(book2);


        for (Book book : bookArrayList) {
            System.out.println(book);
        }

        bookArrayList.get(0).setName("Data Communication");
        System.out.println(bookArrayList.get(0));

        //remove
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(2);
        integerList.add(1);
        integerList.add(3);
        integerList.add(1);
        integerList.add(4);
        integerList.add(1);
        System.out.println("Before deleting : "+integerList);

        integerList.remove(1); //removes the 2nd value (2) at index 1
        System.out.println("After deleting index 1 : "+integerList);
        //to remove 1st occurrence of the value 1
        integerList.remove(Integer.valueOf(1));
        System.out.println("After deleting value 1 : "+integerList);
        //to remove all occurrence of the value 1
        integerList.removeIf(n->(n.equals(1)));
        System.out.println("After deleting all occurrence of 1 : "+integerList);

    }
}
