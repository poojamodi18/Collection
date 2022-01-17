import pojo.Book;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
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
        list.set(0,"One");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        //Add new arraylist to existing using addAll()
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("One");
        list2.add("Two");

        list.addAll(list2);
        System.out.println(list);

        //List with class object as value
        Book book1 = new Book(101,"Operating System","Galvin","Wiley");
        Book book2 = new Book(102,"DCN","Forouzan", "Mc Hill");

        ArrayList<Book> bookArrayList = new ArrayList<>();
        bookArrayList.add(book1);
        bookArrayList.add(book2);


        for(Book book : bookArrayList){
            System.out.println(book);
        }

        bookArrayList.get(0).setName("Data Communication");
        System.out.println(bookArrayList.get(0));

    }
}
