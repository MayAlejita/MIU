package MPP_Pretest.datastructure;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("a");
        queue.add("b");

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
