import java.util.Queue;
import java.util.LinkedList;

public class queues {
    public static void main(String[] args) {

        // Queues = FIFO, First-In First-Out
        /*
            add = enqueue, offer()
            remove = dequeue, poll()
        */
        
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Sharen");
        queue.offer("Carlo");
        queue.offer("JC");
        queue.offer("Don");
        queue.offer("John");

        System.out.println(queue);
    }
}