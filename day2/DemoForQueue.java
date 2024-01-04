
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class DemoForQueue {

    public void samplePriorityQueueMethod() {

        PriorityQueue<Integer> priorityQueueToken = new PriorityQueue<>();
        priorityQueueToken.add(101);
        priorityQueueToken.add(202);
        priorityQueueToken.add(303);
        priorityQueueToken.add(404);
        System.out.println("PriorityQueue of Token: " + priorityQueueToken);
        int frontToken = priorityQueueToken.poll();
        System.out.println("Removed Front Token: " + frontToken);
        System.out.println("Updated priorityQueueToken: " + priorityQueueToken);
        priorityQueueToken.offer(505);
        System.out.println("Updated PriorityQueueToken: " + priorityQueueToken);
        int peekedToken = priorityQueueToken.peek();
        System.out.println("Peeked Token: " + peekedToken);
        System.out.println("PriorityQueueToken after peek: " + priorityQueueToken);
        System.out.println("Contains 20: " + priorityQueueToken.contains(202));
        System.out.println("Iterating through the PriorityQueueToken:");
        while (!priorityQueueToken.isEmpty()) {
            System.out.println(priorityQueueToken.poll() + " ");
        }
    }

    public void sampleArrayDequeMethod(){
         ArrayDeque<String> arrayDequeRequest = new ArrayDeque<>();

        arrayDequeRequest.addFirst("Request1");
        arrayDequeRequest.addLast("Request2");
        arrayDequeRequest.offerFirst("Request3");
        arrayDequeRequest.offerLast("Request4");
        System.out.println("ArrayDequeRequest: " + arrayDequeRequest);
        String frontElement = arrayDequeRequest.pollFirst();
        System.out.println("Removed Front Element: " + frontElement);
        String rearElement = arrayDequeRequest.pollLast();
        System.out.println("Removed Rear Element: " + rearElement);
        System.out.println("Updated ArrayDequeRequest: " + arrayDequeRequest);
        arrayDequeRequest.offerFirst("Request5");
        arrayDequeRequest.addLast("Request6");
        System.out.println("Updated ArrayDequeRequest: " + arrayDequeRequest);
        String peekedFrontElement = arrayDequeRequest.peekFirst();
        System.out.println("Peeked Front Element: " + peekedFrontElement);
        String peekedRearElement = arrayDequeRequest.peekLast();
        System.out.println("Peeked Rear Element: " + peekedRearElement);
        System.out.println("ArrayDequeRequest after peek: " + arrayDequeRequest);
        System.out.println("Contains 'Request10': " + arrayDequeRequest.contains("Request10"));
        System.out.println("Iterating through the ArrayDequeRequest:");
        for (String request : arrayDequeRequest) {
            System.out.println(request + " ");
        }
    }

    public static void main(String[] args) {

        DemoForQueue demoForQueue = new DemoForQueue();
        System.out.println("==================PriorityQueue=========================");
        demoForQueue.samplePriorityQueueMethod();
        System.out.println("==================PriorityQueue=========================");
        demoForQueue.sampleArrayDequeMethod();
    }
}