package collectionExamples;

//detect loop in linked list
class ListLinked {
    int num;
    ListLinked next;

    ListLinked(int num) {
        this.num = num;
        this.next = null;
    }
}

/*
1 -> 2 -> 3 -> 4
           |    |
           6 <- 5
 */
public class LoopInLinkedList {
    public static void main(String[] args) {
        ListLinked one = new ListLinked(1);
        ListLinked two = new ListLinked(2);
        one.next = two;
        ListLinked three = new ListLinked(3);
        two.next = three;
        ListLinked four = new ListLinked(4);
        three.next = four;
        ListLinked five = new ListLinked(5);
        four.next = five;
        ListLinked six = new ListLinked(6);
        five.next = six;
        six.next = two;
        displayLinked(one);

        //detect loop
        ListLinked first = one;
        ListLinked second = one;
        while (first != null && first.next != null) {
            first = first.next.next;
            second = second.next;
            if (first == second) {
                System.out.println("Linked list have loop");
                break;
            }
        }

    }

    private static void displayLinked(ListLinked one) {
        ListLinked show = one;
        for (int i = 0; i < 10; i++) {
            System.out.println(show.num);
            show = show.next;
        }
    }

}
