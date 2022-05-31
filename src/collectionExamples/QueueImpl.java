package collectionExamples;

import java.util.LinkedList;
import java.util.Queue;
public class QueueImpl {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Joon");
        queue.offer("Jin");
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.offer("Yoon");
        System.out.println(queue);
        queue.clear();
        System.out.println(queue);
    }
}
