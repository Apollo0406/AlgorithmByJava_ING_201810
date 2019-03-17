package DataStructure.StackDemo.Stack2Queue;

public class SQueueTest {
    public static void main(String[] args) {
        Stack2Queue queue = new Stack2Queue(5);
        System.out.println("isEmpty():"+queue.isEmpty());
        System.out.println("isFull():"+queue.isFull());
        System.out.println("getMaxSize():"+queue.getMaxSize());
        System.out.println("size():"+queue.size());
        System.out.println("----------------------");
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println("isEmpty():"+queue.isEmpty());
        System.out.println(".isFull():"+queue.isFull());
        System.out.println("getMaxSize():"+queue.getMaxSize());
        System.out.println("size():"+queue.size());
        System.out.println("----------------------");
        System.out.println("queue.pop()"+queue.pop());
        System.out.println("queue.pop()"+queue.pop());
        System.out.println("queue.pop()"+queue.pop());
        System.out.println("isEmpty():"+queue.isEmpty());
        System.out.println(".isFull():"+queue.isFull());
        System.out.println("getMaxSize():"+queue.getMaxSize());
        System.out.println("size():"+queue.size());
        System.out.println("----------------------");

    }
}
