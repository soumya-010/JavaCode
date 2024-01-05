import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
    Queue<String>  queue = new LinkedList<>();
        queue.offer("Soumya"); //Offer adds an element to the end of the queue (if the queue is not full)
        queue.offer("Shubham");

        //Iterate LinkedList using for loop
        for (String name : queue) {
            System.out.println(name);
        }

        System.out.println("\n *********************** \n");

        System.out.println("Peeking at Queue:" + queue.peek()); //Returns the top element (if the queue is not empty)
        String pollValue = queue.poll(); //Removes the top element (if the queue is not empty)
        System.out.println("Polled from Queue:" + pollValue);

        System.out.println("\n *********************** \n");

        //Iterate LinkedList using Iterator
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
