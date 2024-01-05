import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        System.out.println("\n ******** PriorityQueue: MIN HEAP ******** \n");

        Queue<Integer> pQueue = new PriorityQueue<>();
        pQueue.offer(10);
        pQueue.offer(30);
        pQueue.offer(20);

        System.out.println(pQueue.peek());
        System.out.println("pQueue (Min Heap) :" +  pQueue);

        System.out.println("\n ******** PriorityQueue: MAX HEAP ******** \n");

        //Comparator.reverseOrder() is used to reverse the order in which elements are inserted in the queue
        Queue<Integer> newPQ = new PriorityQueue<>(Comparator.reverseOrder());
        newPQ.offer(10);
        newPQ.offer(30);
        newPQ.offer(20);

        System.out.println(newPQ.peek());
        System.out.println("newPQ (Max Heap) :" +  newPQ);
    }
}
